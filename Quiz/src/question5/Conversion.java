/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.util.ArrayList;

/**
 *
 * @author Om
 */
public class Conversion {

    public static boolean isDigit(char y) {
        for (int i = 0; i < 10; i++) {
            char c = Character.forDigit(i, 10);
            if (y == c) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumber(String x) {

        int startIndex = 0;
        if ((x.charAt(0) == '-' || x.charAt(0) == '+')) {
            startIndex = 1;
            if (x.length() == 1) {
                return false;
            }
        }

        for (int i = startIndex; i < x.length(); i++) {
            if (!isDigit(x.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean rangeValidation(String x) {
        if (isNumber(x)) {
            int t = Integer.parseInt(x);
            if (t <= 127 && t >= -128) {
                return true;
            }

        }
        return false;
    }

    public static boolean isInRange(String x) {
        if (isNumber(x)) {
            int t = Integer.parseInt(x);
            if (t >= 0 && t <= 128) {
                return true;
            }

        }
        return false;
    }

    public static boolean isValidForConversion(String x) {
        if (isNumber(x) && rangeValidation(x)) {
            return true;
        }
        return false;
    }

    public static String toBinary(String x) {
        int t = Integer.parseInt(x);
        int quotient = t / 2;
        int remainder = t % 2;
        ArrayList<String> list = new ArrayList<>();
        list.add(remainder + "");
        while (quotient != 0) {
            remainder = quotient % 2;
            list.add(remainder + "");
            quotient = quotient / 2;
        }
        ArrayList<String> finalList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            finalList.add(list.get(i));
        }
        StringBuilder rFinal = new StringBuilder();
        for (int i = 0; i < finalList.size(); i++) {
            rFinal.append(finalList.get(i));
        }
        return rFinal.toString();
    }

    public static String padding(String x) {
        int noOfZeros = 8 - x.length();

        StringBuilder y = new StringBuilder();
        for (int i = 0; i < noOfZeros; i++) {
            y.append("0");
        }
        y.append(x);
        return y.toString();
    }

    public static String flipBits(String x) {
        StringBuilder fb = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '1') {
                fb.append('0');
            } else {
                fb.append('1');
            }
        }

        return fb.toString();

    }

    public static String addOne(String base2) {

        StringBuilder x = new StringBuilder();
        int carry = 0;
        int stopIndex = 0;
        for (int i = base2.length() - 1; i >= 0; i--) {

            if (base2.charAt(i) == '1') {
                x.append('0');
                carry = 1;
                stopIndex = i;
            } else {
                x.append('1');
                carry = 0;
                stopIndex = i;
                break;
            }
        }

        if (carry == 1) {
            x.append('1');
        } else {
            for (int i = stopIndex - 1; i >= 0; i--) {
                x.append(base2.charAt(i));
            }
        }

        return x.reverse().toString();

    }

    public static String negBase2(String base10) {
        if (isInRange(base10)) {
            String x = toBinary(base10);
            String p = padding(x);
            String y = flipBits(p);
            String z = addOne(y);
            return z;
        } else {
            throw new IllegalArgumentException("Arguement cant be converted");
        }

    }

    public static String base10to2(String base10) {
        if (isValidForConversion(base10)) {
            int local = Integer.parseInt(base10);
            if(local>=0){
            String x = toBinary(base10);
            return padding(x);
            }
            else {
                int n = -1 * local;
                
            String x = negBase2(Integer.toString(n));
            return x;
            }

        } else {
            throw new IllegalArgumentException("Argument can't be converted");
        }
    }
}

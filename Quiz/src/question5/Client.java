/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Om
 */
public class Client {
    
    public static void main(String[] args) {
        /*System.out.println(Conversion.isDigit('e'));
        System.out.println(Conversion.isDigit('1'));
        
        System.out.println(Conversion.isNumber("123e"));*/
        /*System.out.println(Conversion.isNumber("-"));
        
        System.out.println(Conversion.rangeValidation("134"));
        System.out.println(Conversion.rangeValidation("122"));
        System.out.println(Conversion.rangeValidation("128"));
        
        System.out.println(Conversion.isValidForConversion("129"));
        System.out.println(Conversion.toBinary("170"));
        System.out.println(Conversion.flipBits("1110"));*/
        //System.out.println(Conversion.addOne("1011"));
        for(int i =127 ; i>=-128;i--){
            System.out.println(String.format("%4d", i) + " => " + Conversion.base10to2(Integer.toString(i)));
        }
        
        try {
         System.out.println(Conversion.base10to2("abc"));
        }
        catch(IllegalArgumentException iae) {
            System.out.println("\"abc\" " + iae.getMessage());
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Om
 */
public class Client {
    
    public static void main(String[] args) {
        
        String[] x = new String[]{"Bob", "Alice","john","Doe"};
        System.out.println(Client.addStringItems(x, true));
        System.out.println(Client.addStringItems(x, false));
                
    }
    
   synchronized public static String addStringItems(String[] items, boolean forceUpperCase)
    {// method is unoptimized as it is thread safe now. It takes more time to execute for a given set of objects
        ArrayList<String> returnValue = new ArrayList<>();
        
        for(int i=0;i<items.length;i++){
            returnValue.add(items[i]);// chose ArrayList collection implementation as it is the basic string collection
        }
        
        StringBuffer finalString = new StringBuffer();
       
        for(String x: returnValue){
            finalString.append(x);// As StringBuffer is thread safe it increases run time there by reducing the optimization
        }
       
        return forceUpperCase?finalString.toString().toUpperCase():finalString.toString();
    }
    
}

// optimized function in question 2 is not thread safe
// unoptimized function in this question3 is thread safe

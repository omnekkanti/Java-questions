/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

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
    
    public static String addStringItems(String[] items, boolean forceUpperCase)
    {
        StringBuilder returnValue = new StringBuilder();
        
        for(int i=0;i<items.length;i++){
            returnValue.append(items[i]);
        }
        return forceUpperCase?returnValue.toString().toUpperCase():returnValue.toString();
    }
}
// Using the StringBuilder object reduces the run time thereby optimizing the code

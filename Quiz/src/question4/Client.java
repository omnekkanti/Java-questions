/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Om
 */
public class Client {
    
    public static void main(String[] args) {
        
        
        ArrayList<String> x = new ArrayList<>();
        x.add("Om");
        x.add("Rob");
        ArrayList<String> y = new ArrayList<>();
        y.add("passive");
        y.add("active");
        
        Iterator<String> iterator1 = x.iterator();
        Iterator<String> iterator2 = y.iterator();
        
        System.out.println(Client.Combine(iterator1, iterator2));
                
    }
    
    public static List<String> Combine(Iterator<String> itr1, Iterator<String>itr2){
    List<String> list = new ArrayList<>();
    while(itr1.hasNext()){
    
        list.add(itr1.next());}
    while(itr2.hasNext()){
    
        list.add(itr2.next());}
       return list;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Om
 */
public class Client {
    
    
    public static void main(String[] args) {
        Range r = new RangeImplemen();
        System.out.println(r.newRange(1, 5).isIn(3));
        System.out.println(r.newRange(1,5).isIn(6));
        System.out.println(r.newRange(1, 5).add(r.newRange(8, 10)).isIn(9));
    }
}

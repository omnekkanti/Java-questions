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
public interface Range {
    
    /**
Create a new Range object representing an integer interval starting from 'from' and 'to',
both limits inclusive
*/

public Range newRange(int from, int to);
/**
* Return if 'value' is in the range defined by this object
*/

public boolean isIn( int value);
/**
* Return the minimum value in range
*/

public int min();
/**
* Return the maximum value in range
*/

public int max();
/**
* Add range 'r' to this range, and return 'this'.
* 'r' and this may denote disjoint ranges, for instance:
* r.newRange(1,5).add(r.newRange(8,10)) denotes a range
* including 1,2,3,4,5,8,9,10
*/

public Range add(Range r);

    
}

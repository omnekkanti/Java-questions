/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;

/**
 *
 * @author Om
 */
public class RangeImplemen implements Range {

    int from;
    int to;
    ArrayList<Range> list = new ArrayList<>();

    public RangeImplemen() {
    }

    
    public RangeImplemen(int from, int to) {
        this.from = from;
        this.to = to;

    }

    public Range newRange(int from, int to) {
        return new RangeImplemen(from, to);
    }

    public boolean isIn(int value) {
        if (value >= from && value <= to) {
            return true;
        }
        for (Range r : list) {
            if (r.isIn(value)) {
                return true;
            }
        }

        return false;
    }

    public int min() {
        return from;
    }

    public int max() {
        return to;
    }

    public Range add(Range r) {

        list.add(r);
        return this;

    }
}

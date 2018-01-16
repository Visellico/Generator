package com.visellico.sudaily.sudoku;

import com.visellico.sudaily.MathUtil;

/**
 * Created by Henry on 1/15/2018.
 */
public class Cell {

    protected int val;

    protected Cell() {}

    public Cell(int val) {

        this.val = MathUtil.clamp(val, 1, 9);
    }

    public int getVal() {
        return val;
    }

    public String toString() {
        return Integer.toString(val);
    }

    public boolean equals(Object o) {
        boolean result = false;

        if (o instanceof Cell)
            result = val == ((Cell) o).val;

        return result;
    }

    public int hashCode() {
        return val;
    }

    public boolean isEmpty() {
        return false;
    }

}

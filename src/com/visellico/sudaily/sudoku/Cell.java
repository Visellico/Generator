package com.visellico.sudaily.sudoku;

/**
 * Created by Henry on 1/15/2018.
 */
public class Cell {

    protected final int EMPTY_CELL_VAL = 0;

    public final int ROW;
    public final int COL;
    public final int GRID;

    public final int SPOT_IN_ROW;
    public final int SPOT_IN_COL;
    public final int SPOT_IN_GRID;

    protected int val;

    public Cell(int row, int col, int val) {

        this.ROW = row;
        this.COL = col;
        this.GRID = (col / 3) + (row / 3) * 3;

        this.SPOT_IN_ROW = COL;
        this.SPOT_IN_COL = ROW;
        this.SPOT_IN_GRID = (COL % 3) + (ROW % 3) * 3;

        this.val = val;
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

}

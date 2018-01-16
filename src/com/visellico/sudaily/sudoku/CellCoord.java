package com.visellico.sudaily.sudoku;

import com.visellico.sudaily.MathUtil;

/**
 * Created by Henry on 1/15/2018.
 */
public class CellCoord {

    private int row, col;
    private Cell cell;

    /**
     * Storage unit for Sudoku. A single puzzle will only store CellCoord instances in a JSON file that represents
     * the locations of cellsIterable which will make up the hint.
     * @param row Row of the cell, 0 - 8
     * @param col Column of the cell, 0 - 8
     * @param cell Cell located at position marked by the row and column
     */
    public CellCoord(int row, int col, Cell cell) {
        this.cell = cell;
        this.row = MathUtil.clamp(row, 0, 8);
        this.col = MathUtil.clamp(col, 0, 8);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getGrid() {
        return (col / 3) + (row / 3) * 3;
    }

    public int getPlaceInGrid() {
        return (col % 3) + (row % 3) * 3;
    }

    public Cell getCell() {
        return cell;
    }

    public boolean equals(Object o) {
        boolean result = false;
        if (o instanceof CellCoord) {
            CellCoord other = (CellCoord) o;
            result = (row == other.row) && (col == other.col) && (cell == other.cell);
        }

        return result;
    }

}

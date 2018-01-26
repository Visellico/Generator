package com.visellico.sudoku;

/**
 * Created by Henry on 1/15/2018.
 */
public class EmptyCell extends Cell {

    public EmptyCell() {
        val = 0;
    }

    public String toString() {
        return "X";
    }

    public boolean isEmpty() {
        return true;
    }

}

package com.visellico.sudaily.sudoku;

/**
 * Created by Henry on 1/15/2018.
 */
public class EmptyCell extends Cell {

    public EmptyCell(int row, int col) {
        super(row, col,0);
    }

    public String toString() {
        return " ";
    }

//    public boolean equals(Object o) {
//        return (o instanceof EmptyCell);
//    }
}

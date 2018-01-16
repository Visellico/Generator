package com.visellico.sudaily.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Henry on 1/15/2018.
 */
public class Board {

    public List<Grid> grids;
    public List<Row> rows;
    public List<Column> cols;

    public Board() {


    }

    public void setCell(Cell c) {

    }

    public Board makeFromCells() {
        Board b = new Board();

        return b;
    }

    public Board shuffle(Board b) {
        Board shuffledBoard = new Board();

        return shuffledBoard;
    }

    public boolean isValid() {
        return true;
    }

}

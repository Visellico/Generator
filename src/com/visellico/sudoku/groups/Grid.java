package com.visellico.sudoku.groups;

import java.util.ArrayList;

/**
 * Created by Henry on 1/15/2018.
 */
public class Grid extends Group {
    public Grid() {
        super();
    }

    public Grid(Grid copyGrid) {
        cells = new ArrayList<>(copyGrid.cells);
    }

//    public String toString() {
//        return "";
//    }
}

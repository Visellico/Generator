package com.visellico.sudaily.sudoku;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henry on 1/15/2018.
 */
public class Grid extends Group {

    public Grid() {
        cells = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            cells.add(new EmptyCell());
        }
    }

    public Grid(List<Cell> cells) {

    }

    public void populate(List<Cell> cells) {
        for (Cell c : cells)
            set(c);
    }

    public void set(Cell c) {
        cells.set(c.SPOT_IN_GRID, c);
    }
}

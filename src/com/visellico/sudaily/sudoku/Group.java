package com.visellico.sudaily.sudoku;

import java.util.List;

/**
 * Created by Henry on 1/15/2018.
 */
public abstract class Group {

    protected List<Cell> cells;

    public abstract void populate(List<Cell> cells);

    public abstract void set(Cell c);

}

package com.visellico.sudaily.sudoku.groups;

import com.visellico.sudaily.sudoku.Cell;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created because I feel like abusing polymorphism
 */
public class CellListNoEmpty extends ArrayList<Cell> {

    public boolean add(Cell c) {
        if (c.getVal() != 0) // Since all empty cellsIterable have 0 as their value, Im going to test for that and not use instanceof
            return super.add(c);
        return false;
    }

    //This is pretty cheap and inefficient, but today is the day for abusing polymorphism
    public boolean addAll(Collection<? extends Cell> c) {
        boolean changed = false;
        for (Cell cell : c) {
            add(cell);
            changed = true;
        }
        return changed;
    }

}

package com.visellico.sudoku.groups;

import com.visellico.sudoku.Cell;
import com.visellico.sudoku.EmptyCell;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Henry on 1/15/2018.
 */
public abstract class Group {

    protected List<Cell> cells;

    public Group() {
        cells = new ArrayList<>();
        for (int i = 0; i < 9; i++)
            cells.add(new EmptyCell());

    }

    public Cell set(int place, Cell cell) {
        return cells.set(place, cell);
    }

    public Cell clear(int place) {
        return cells.set(place, new EmptyCell());
    }

    public boolean isValid() {
        List<Cell> nonEmpty = new CellListNoEmpty();
        nonEmpty.addAll(cells);

        Set<Cell> set = new HashSet<>(nonEmpty);
        return (set.size() == nonEmpty.size());

    }

    public Iterable<Cell> cellsIterable() {
        return cells;
    }

}

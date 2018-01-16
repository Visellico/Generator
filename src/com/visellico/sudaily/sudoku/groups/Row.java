package com.visellico.sudaily.sudoku.groups;

import java.util.ArrayList;

/**
 * Created by Henry on 1/15/2018.
 */
public class Row extends Group {

    public Row() {
        super();
    }

    public Row(Row copyRow) {
        cells = new ArrayList<>(copyRow.cells);
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            sb.append(cells.get(i).toString());
            int next = i + 1;
            if (next % 3 == 0 && next < 9)
                sb.append("|");
        }
        return sb.toString();
    }
}

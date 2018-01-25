package com.visellico.sudoku.groups;

import java.util.ArrayList;

/**
 * Created by Henry on 1/15/2018.
 */
public class Column extends Group {

    public Column() {
        super();
    }

    public Column(Column copyColumn) {
        cells = new ArrayList<>(copyColumn.cells);
    }

//    public String toString() {
//        StringBuilder sb = new StringBuilder("COL: ");
//
//        for (int i = 0; i < 9; i++) {
//            sb.append(cells.get(i).toString());
//            int next = i + 1;
//            if (next % 3 == 0 && next < 9)
//                sb.append("|");
//        }
//        return sb.toString();
//    }
}

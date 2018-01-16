package com.visellico.sudaily.sudoku;

import com.visellico.sudaily.sudoku.groups.Column;
import com.visellico.sudaily.sudoku.groups.Grid;
import com.visellico.sudaily.sudoku.groups.Group;
import com.visellico.sudaily.sudoku.groups.Row;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Henry on 1/15/2018.
 */
public class Board {

    public List<Row> rows = new ArrayList<>();
    public List<Column> cols = new ArrayList<>();
    public List<Grid> grids = new ArrayList<>();

    public Cell[][] allCells;

    public Board() {
        allCells = new Cell[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                allCells[i][j] = new EmptyCell();
            }
            rows.add(new Row());
            cols.add(new Column());
            grids.add(new Grid());
        }
    }

    public Board(Board copyFrom) {
        for (Row copyRow : copyFrom.rows)
            rows.add(new Row(copyRow));
        for (Column copyCol : copyFrom.cols)
            cols.add(new Column(copyCol));
        for (Grid copyGrid : copyFrom.grids)
            grids.add(new Grid(copyGrid));

        allCells = new Cell[9][9];
        for (int r = 0; r < 9; r++) {
            System.arraycopy(copyFrom.allCells[r], 0, allCells[r], 0, 9);
        }
    }

    public CellCoord setCell(CellCoord cellCoord) {

        if (cellCoord == null) return null;

        int row = cellCoord.getRow();
        int col = cellCoord.getCol();
        int grid = cellCoord.getGrid();
        int placeInGrid = cellCoord.getPlaceInGrid();

        Cell oldCell = allCells[row][col];
        Cell newCell = cellCoord.getCell();

        allCells[row][col] = newCell;
        rows.get(row).set(col, newCell);
        cols.get(col).set(row, newCell);
        grids.get(grid).set(placeInGrid, newCell);

        return new CellCoord(row, col, oldCell);
    }

    public boolean isValid() {
        List<Group> groups = new ArrayList<>();

        groups.addAll(rows);
        groups.addAll(cols);
        groups.addAll(grids);

        for (Group g : groups) {
            if (!g.isValid()) {
                return false;
            }
        }
        return true;
    }

    public static Board makeFromCellCoords(List<CellCoord> cellCoords) {
        Board board = new Board();

        for (CellCoord cc : cellCoords)
            board.setCell(cc);

        return board;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            int next = i + 1;
            sb.append(rows.get(i).toString() + System.lineSeparator());

            if (next % 3 == 0 && next < 9)
                sb.append("-----------" + System.lineSeparator());
        }
        return sb.toString();
    }

}

package com.visellico;

import com.visellico.sudoku.Board;
import com.visellico.sudoku.Cell;
import com.visellico.sudoku.CellCoord;

import java.util.Arrays;

public class Boards {

    public static Board b1 = Board.makeFromCellCoords(Arrays.asList(
            new CellCoord(0, 2, new Cell(5)),
            new CellCoord(0, 3, new Cell(3)),
            new CellCoord(0, 4, new Cell(4)),
            new CellCoord(0, 5, new Cell(1)),
            new CellCoord(0, 7, new Cell(8)),
            new CellCoord(1, 4, new Cell(5)),
            new CellCoord(2, 0, new Cell(2)),
            new CellCoord(2, 5, new Cell(7)),
            new CellCoord(2, 7, new Cell(6)),
            new CellCoord(3, 4, new Cell(9)),
            new CellCoord(3, 7, new Cell(3)),
            new CellCoord(4, 0, new Cell(8)),
            new CellCoord(4, 1, new Cell(1)),
            new CellCoord(5, 0, new Cell(4)),
            new CellCoord(5, 6, new Cell(1)),
            new CellCoord(5, 7, new Cell(7)),
            new CellCoord(6, 0, new Cell(6)),
            new CellCoord(6, 1, new Cell(4)),
            new CellCoord(6, 2, new Cell(8)),
            new CellCoord(6, 4, new Cell(3)),
            new CellCoord(7, 2, new Cell(2)),
            new CellCoord(8, 5, new Cell(9)),
            new CellCoord(8, 8, new Cell(7))
    ));

}

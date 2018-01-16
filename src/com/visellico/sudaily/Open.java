package com.visellico.sudaily;

import com.visellico.sudaily.backtracking.Backtracker;
import com.visellico.sudaily.sudoku.Board;
import com.visellico.sudaily.sudoku.Cell;
import com.visellico.sudaily.sudoku.CellCoord;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Henry on 1/15/2018.
 */
public class Open {

    public static void main(String[] args) {
        List<CellCoord> cells = Arrays.asList(
                new CellCoord(4, 2, new Cell(1)),
                new CellCoord(7, 6, new Cell(4)),
                new CellCoord(5, 7, new Cell(4)),
                new CellCoord(8, 8, new Cell(6)),
                new CellCoord(2, 2, new Cell(9)),
                new CellCoord(4, 5, new Cell(7)),
                new CellCoord(3, 0, new Cell(8))
        );

        Board board = Board.makeFromCellCoords(cells);
        System.out.println(board);

        BoardConfig yep = new BoardConfig(board);
        BoardConfig solved = (BoardConfig) Backtracker.solve(yep);

        System.out.println(solved.board);

    }

}

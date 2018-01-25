package com.visellico;

import com.visellico.backtracking.Backtracker;
import com.visellico.sudoku.Board;
import com.visellico.sudoku.Cell;
import com.visellico.sudoku.CellCoord;
import com.visellico.sudoku.StartingCell;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Henry on 1/15/2018.
 */
public class Open {

    public static void main(String[] args) {

        test3();

    }

    public static void test1() {
        List<CellCoord> cells = Arrays.asList(
                new CellCoord(4, 2, new StartingCell(1)),
                new CellCoord(7, 6, new StartingCell(4)),
                new CellCoord(5, 7, new StartingCell(4)),
                new CellCoord(8, 8, new StartingCell(6)),
                new CellCoord(2, 2, new StartingCell(9)),
                new CellCoord(4, 5, new StartingCell(7)),
                new CellCoord(3, 0, new StartingCell(8))
        );

        Board board = Board.makeFromCellCoords(cells);
        System.out.println(board);

        BoardConfig yep = new BoardConfig(board);
        BoardConfig solved = (BoardConfig) Backtracker.solve(yep);

        System.out.println(solved.board);
    }

    //NYT hard puzzle 1/16/18
    public static void test2() {
        List<CellCoord> cells = Arrays.asList(
                new CellCoord(0, 0, new StartingCell(8)),
                new CellCoord(0, 1, new StartingCell(9)),
                new CellCoord(0, 2, new StartingCell(4)),
                new CellCoord(1, 1, new StartingCell(2)),
                new CellCoord(2, 4, new StartingCell(6)),
                new CellCoord(2, 8, new StartingCell(5)),
                new CellCoord(3, 5, new StartingCell(5)),
                new CellCoord(3, 6, new StartingCell(9)),
                new CellCoord(3, 8, new StartingCell(1)),
                new CellCoord(4, 1, new StartingCell(7)),
                new CellCoord(4, 4, new StartingCell(1)),
                new CellCoord(5, 2, new StartingCell(2)),
                new CellCoord(5, 5, new StartingCell(8)),
                new CellCoord(6, 0, new StartingCell(7)),
                new CellCoord(6, 1, new StartingCell(6)),
                new CellCoord(6, 6, new StartingCell(3)),
                new CellCoord(6, 8, new StartingCell(2)),
                new CellCoord(7, 4, new StartingCell(5)),
                new CellCoord(7, 5, new StartingCell(7)),
                new CellCoord(8, 2, new StartingCell(3)),
                new CellCoord(8, 3, new StartingCell(9)),
                new CellCoord(8, 7, new StartingCell(4))
        );

        Board board = Board.makeFromCellCoords(cells);
        System.out.println(board);

        BoardConfig yep = new BoardConfig(board);
        BoardConfig solved = (BoardConfig) Backtracker.solve(yep);

        System.out.println(solved.board);
    }

    //NYT hard puzzle 1/17/18
    public static void test3() {
        List<CellCoord> cells = Arrays.asList(
                new CellCoord(0, 2, new StartingCell(5)),
                new CellCoord(0, 3, new StartingCell(3)),
                new CellCoord(0, 4, new StartingCell(4)),
                new CellCoord(0, 5, new StartingCell(1)),
                new CellCoord(0, 7, new StartingCell(8)),
                new CellCoord(1, 4, new StartingCell(5)),
                new CellCoord(2, 0, new StartingCell(2)),
                new CellCoord(2, 5, new StartingCell(7)),
                new CellCoord(2, 7, new StartingCell(6)),
                new CellCoord(3, 4, new StartingCell(9)),
                new CellCoord(3, 7, new StartingCell(3)),
                new CellCoord(4, 0, new StartingCell(8)),
                new CellCoord(4, 1, new StartingCell(1)),
                new CellCoord(5, 0, new StartingCell(4)),
                new CellCoord(5, 6, new StartingCell(1)),
                new CellCoord(5, 7, new StartingCell(7)),
                new CellCoord(6, 0, new StartingCell(6)),
                new CellCoord(6, 1, new StartingCell(4)),
                new CellCoord(6, 2, new StartingCell(8)),
                new CellCoord(6, 4, new StartingCell(3)),
                new CellCoord(7, 2, new StartingCell(2)),
                new CellCoord(8, 5, new StartingCell(9)),
                new CellCoord(8, 8, new StartingCell(7))
        );

        Board board = Board.makeFromCellCoords(cells);
        System.out.println(board);

        BoardConfig yep = new BoardConfig(board);
        BoardConfig solved = (BoardConfig) Backtracker.solve(yep);

        System.out.println(solved.board);
    }

}

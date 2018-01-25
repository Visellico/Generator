package com.visellico;

import com.visellico.backtracking.Config;
import com.visellico.sudoku.Board;
import com.visellico.sudoku.Cell;
import com.visellico.sudoku.CellCoord;
import com.visellico.viewer.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henry on 1/15/2018.
 */
public class BoardConfig extends Config {

    public Board board;
    private int pointer = 0;

    public static View view;

    public BoardConfig(Board board) {

        this.board = board;
        addObserver(view);

    }

    public BoardConfig(BoardConfig boardConfig) {
        board = new Board(boardConfig.board);
        addObserver(view);
    }

    public boolean isGoal() {

        for (int r = 0; r < 9; r++)
            for (int c = 0; c < 9; c++)
                if (board.allCells[r][c].isEmpty()) return false;
        return true;
    }

    public boolean isValid() {
        return board.isValid();
//        List<Group> groups = new ArrayList<>();
//
//        groups.addAll(board.rows);
//        groups.addAll(board.cols);
//        groups.addAll(board.grids);
//
//        for (Group g : groups) {
//
//            if (!g.isValid()) {
//                System.out.println("False");
//                return false;
//            }
//        }
//        return true;
    }

    private int pointerRow() {
        return pointer / 9;
    }

    private int pointerCol() {
        return pointer % 9;
    }

    public Iterable<Config> getSuccessors() {   //might modify to only return valid children

        while (!board.allCells[pointerRow()][pointerCol()].isEmpty()) {
            pointer++;
        }

        List<Config> children = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            BoardConfig temp = new BoardConfig(this);
            temp.board.setCell(new CellCoord(pointerRow(), pointerCol(), new Cell(i)));
            children.add(temp);

        }
        return children;
    }

    public void display() {

        view.showBoard(board);
//        setChanged();
//        notifyObservers(board);

    }
}

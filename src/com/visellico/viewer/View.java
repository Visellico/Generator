package com.visellico.viewer;

import com.visellico.BoardConfig;
import com.visellico.Boards;
import com.visellico.MathUtil;
import com.visellico.backtracking.Backtracker;
import com.visellico.sudoku.Board;
import com.visellico.sudoku.Cell;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class View extends Application implements Observer {

    public BoardConfig view;
    public GridPane cells;
    public Label[] labels;

    public List<Board> states = new ArrayList<>();


    Font font = new Font("Cambria", 32);

    public void init() {

        view = new BoardConfig(Boards.b1);
        view.setObserver(this);


    }

    public void stop() {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        cells = makeCells();

        Scene makeAScene = new Scene(cells);
        primaryStage.setScene(makeAScene);
        primaryStage.show();

        view = (BoardConfig) Backtracker.solve(view);
    }

    public GridPane makeCells() {
        GridPane pane = new GridPane();
        labels = new Label[9*9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Label tmp = new Label("0");
                tmp.setFont(font);
                labels[i + j * 9] = tmp;
                pane.add(tmp, i, j);
            }
        }
        return pane;
    }

    public void showBoard(Board board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                setCell(i, j, board.allCells[i][j].getVal());
            }
        }
    }

    public void setCell(int row, int column, int num) {
        labels[row + column * 9].setText(Integer.toString(num));

    }

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void update(Object o) {
        showBoard((Board) o);

    }
}

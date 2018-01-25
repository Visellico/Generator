package com.visellico.viewer;

import com.visellico.BoardConfig;
import com.visellico.Boards;
import com.visellico.backtracking.Backtracker;
import com.visellico.sudoku.Board;
import com.visellico.sudoku.Cell;
import com.visellico.sudoku.StartingCell;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


public class View extends Application implements Observer {

    public BoardConfig view;

    public List<Board> states = new ArrayList<>();
//    public int[] cellNums = new int[9*9];
    public Cell[] cells = new Cell[9*9];

    public Canvas canvas;
    public GraphicsContext gc;
    public boolean running = true;
    Font font = new Font("Cambria", 50);


    public void init() {

        BoardConfig.view = this;
        view = new BoardConfig(Boards.b1);
//        view.addObserver(this);


    }

    public void stop() {
        System.exit(0);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene makeAScene = new Scene(canvasPane());
        primaryStage.setScene(makeAScene);
        primaryStage.show();

        new Thread(this::renderLoop).start();
        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            Backtracker.solve(view);
        }).start();

//        System.out.println("waiting..");
//        try {
//            Thread.sleep(10000);
//            System.out.println("okay go");
////            view = (BoardConfig) Backtracker.solve(view);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    public void renderLoop() {

        long currentTime;
        double frameRate = 1_000_000_000 / 60;
        double frameDelta = 0;
        double deltaDelta;
        long lastTime = System.nanoTime();
        int tempFlip = 0;
        double updateDelta = 0;

        view.display();

        while (running) {

            currentTime = System.nanoTime();
            deltaDelta = (currentTime - lastTime) / frameRate;
            frameDelta += deltaDelta;
            updateDelta += deltaDelta;
            lastTime = currentTime;


            while (frameDelta >= .2) {
                render();
                frameDelta-=.2;
            }

//            while (updateDelta >= 1) {
//
//                if (tempFlip++ % 2 == 0) {
//                    showBoard(Boards.b1);
//                }
//                else {
//                    showBoard(Boards.b2);
//                }
//                updateDelta -= 1;
//            }
        }
    }

    public void render() {
        gc.setFill(Color.GRAY);
        gc.fillRect(0,0,canvas.getWidth(), canvas.getHeight());

        gc.setFill(Color.BLACK);
        gc.setFont(font);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (cells[i + j * 9].getVal() > 0) {
                    if (cells[i + j * 9] instanceof StartingCell)
                        gc.setFill(Color.RED);
                    else
                        gc.setFill(Color.BLACK);
                    gc.fillText("" + cells[i + j * 9].getVal(), i * 50, j * 50);
                }
            }
        }

    }

    public Pane canvasPane() {
        BorderPane pane = new BorderPane();
        canvas = new Canvas(450, 450);
        gc = canvas.getGraphicsContext2D();

        pane.setCenter(canvas);
        return pane;
    }

    public void showBoard(Board board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                setCell(i, j, board.allCells[i][j]);
            }
        }
    }

    public void setCell(int row, int column, Cell cell) {
        cells[row + column * 9] = cell;

    }

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void update(Observable o, Object arg) {

        showBoard((Board) arg);

    }
}

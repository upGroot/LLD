package LLD.SnakeAndLadder;

import java.util.concurrent.*;

public class Board {
    Cells[][] cells;
    int size;
    public Board(int size, int noOfSnakes, int noOfLadders) {
        this.size = size;
        cells = new Cells[size][size];
    }
    public void initializeGame() {
        for(int i = 0; i < size; i ++) {
            for(int j = 0; j < size; j ++) {
                Cells cell = new Cells();
                cells[i][j] = cell;
            }
        }
    }
    public void addSnakesAndLadders(int noOfSnakes, int noOfLadders) {
        while(noOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(20, size * size - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, snakeHead - 1);
            if(snakeTail == snakeHead)
                continue;
            Jump jump = new Jump();
            jump.start = snakeHead;
            jump.end = snakeTail;
            Cells cell = getCell(snakeHead);
            cell.jump = jump;
            noOfSnakes --;
        }
        while(noOfLadders > 0) {
            int laddersHead = ThreadLocalRandom.current().nextInt(10, size * size - 1);
            int laddersTail = ThreadLocalRandom.current().nextInt(laddersHead + 1, size * size - 1);
            if(laddersHead == laddersTail)
                continue;
            Jump jump = new Jump();
            jump.start = laddersHead;
            jump.end = laddersTail;
            Cells cell = getCell(laddersHead);
            cell.jump = jump;
            noOfLadders --;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    Cells getCell(int playerPosition) {
        int boardRow = playerPosition / cells.length;
        int boardColumn = (playerPosition % cells.length);
        return cells[boardRow][boardColumn];
    }

}

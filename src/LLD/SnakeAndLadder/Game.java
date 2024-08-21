package LLD.SnakeAndLadder;

import java.util.*;

public class Game {
    Board board;
    Deque<Player> players;
    Dice dice;

    public Game(Board board, Deque<Player> players, Dice dice) {
        this.board = board;
        this.players = players;
        this.dice = dice;
    }
    public String startGame() {
        int winningPos = board.getSize() * board.getSize() - 1;
        while(true) {
            Player currentPlayer = players.pollFirst();
            System.out.println(currentPlayer.getName());
            int currentPlayerTotal = checkForSnakeOrLadder(currentPlayer.getCurrentPos() + dice.rollDice());
            currentPlayer.setCurrentPos(currentPlayerTotal);
            players.addLast(currentPlayer);
            if(currentPlayerTotal == winningPos) {
                return currentPlayer.getName() + " won";
            }
            System.out.println(players.peekFirst().getName() + " turn now");
        }
    }
    public int checkForSnakeOrLadder(int currentPos) {
        Cells cell = board.getCell(currentPos);
        if (cell.jump != null && cell.jump.start == currentPos) {
            if (cell.jump.start > cell.jump.end)
                System.out.println("Oh....... that's a snake, going down position by " + (cell.jump.start - cell.jump.end));
            else
                System.out.println("Great......... that's a ladder, going up position by" + (cell.jump.end - cell.jump.start));
            return cell.jump.end;
        }
        return currentPos;
    }
}

package LLD.TicTacToe;

import java.util.*;

public class TicTacToe {
    Deque<Player> players;
    Board board;
    public TicTacToe() {
        initializeGame();
    }
    public void initializeGame() {
        players = new LinkedList<>();
        Player player1 = new Player("Ayush", PlayerSign.X);
        Player player2 = new Player("Pathak", PlayerSign.O);
        players.add(player1);
        players.add(player2);
        board = new Board(3);
    }
    public String startGame() {
        boolean noWinner = true;
        while(noWinner) {

        }
        return "tie";
    }
}

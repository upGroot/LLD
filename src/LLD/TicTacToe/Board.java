package LLD.TicTacToe;

public class Board {
    private int size;
    private PlayerSign board[][];
    public Board(int size) {
        this.size = size;
        board = new PlayerSign[size][size];
    }
    public boolean addSign(int row, int column, PlayerSign playingPiece) {
        if(board[row][column] != null) {
            return false;
        }
        board[row][column] = playingPiece;
        return true;
    }


}

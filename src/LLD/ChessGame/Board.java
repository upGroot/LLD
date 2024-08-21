package LLD.ChessGame;

public class Board {
    Cell[][] cells;
    int size;
    public Board(int size) {
        this.size = size;
        cells = new Cell[size][size];
        initialize();
    }
    public void initialize() {
        int currIndex = 0;
        while(currIndex ++ < size) {
            Peice peice = new Army("White");
            Cell cell = new Cell(peice);
            cells[1][currIndex] = cell;
        }
        currIndex = 0;
        while(currIndex ++ < size) {
            Peice peice = new Army("Black");
            Cell cell = new Cell(peice);
            cells[6][currIndex] = cell;
        }
    }
    public void move(Cell cell) {
        Peice p = cell.peice;
        Cell end = p.behavior(cell);
        if (end.peice != null) {
            removeOpponentPiece(end, p);
        }
    }
    public void removeOpponentPiece(Cell position, Peice peice) {

    }
}

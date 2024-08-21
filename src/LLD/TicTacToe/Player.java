package LLD.TicTacToe;

public class Player {
    private String name;
    private PlayerSign playingSign;
    public Player(String name, PlayerSign playingSign) {
        this.name = name;
        this.playingSign = playingSign;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

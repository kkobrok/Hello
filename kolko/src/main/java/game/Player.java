package game;

public class Player {
    private final char symbol;
    private Boolean win =false;

    public Player(char symbolPlayer) {
        this.symbol = symbolPlayer;
    }

    public Boolean getWin() {
        return win;
    }

    public char getSymbol() {
        return symbol;
    }
}

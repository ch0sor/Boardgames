public class Player{

    private String name;
    private Symbol symbol;
    private int round;


    public Player(String name, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
        this.round = 0;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getRound() {
        return round;
    }

    public void increaseRound() {
        this.round++;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setSymbol(Symbol symbol){
        this.symbol = symbol;
        return symbol;
    }

    public int setRound(int round) {
        this.round = round;
        return round;
    }

}

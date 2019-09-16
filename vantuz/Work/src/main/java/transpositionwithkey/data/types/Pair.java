package transpositionwithkey.data.types;

public class Pair {
    public char symbol;
    public int prevIndex;

    public Pair(char symbol, int prevIndex) {
        this.symbol = symbol;
        this.prevIndex = prevIndex;
    }
}

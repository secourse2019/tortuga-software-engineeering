package transpositionwithkey.data.types;

public class Pair {
    public int symbolCode;
    public int prevIndex;

    public Pair(char symbol, int prevIndex) {
        this.symbolCode = (int)symbol;
        this.prevIndex = prevIndex;
    }
}

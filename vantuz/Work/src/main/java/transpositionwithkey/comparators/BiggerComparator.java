package transpositionwithkey.comparators;

public class BiggerComparator implements IComparator {
    @Override
    public int compare(int f, int s) {
        return f - s;
    }
}

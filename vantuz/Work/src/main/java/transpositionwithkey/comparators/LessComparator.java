package transpositionwithkey.comparators;

public class LessComparator implements IComparator {
    @Override
    public int compare(int f, int s) {
        return s - f;
    }
}

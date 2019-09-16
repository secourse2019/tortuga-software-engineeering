package util.data.types;

import java.util.HashMap;
import java.util.Map;

public class SquareMatrix {
    private int[][] data;
    private int size;

    public SquareMatrix(int[][] data) {
        this.data = data;
        this.size = data.length;
    }

    public int[][] getData() {
        return data;
    }

    public int getSize() {
        return size;
    }

    public int getSquare() {
        return size * size;
    }

    public void insert(int value, int i, int j) {
        data[i][j] = value;
    }

    public void insert(int value, int order) {
        data[order / size][order % size] = value;
    }

    public int getByOrder(int order) {
        return data[order / size][order % size];
    }

    public Map<Integer, Integer> convertToDict() {
        Map<Integer, Integer> result = new HashMap<Integer, Integer>();

        for (int i = 0; i < this.getSquare(); ++i) {
            result.put(this.getByOrder(i) - 1, i);
        }

        return result;
    }
}
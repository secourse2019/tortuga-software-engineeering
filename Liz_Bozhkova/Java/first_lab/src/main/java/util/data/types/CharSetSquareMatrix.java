package util.data.types;

public class CharSetSquareMatrix {
    private char[][] data;
    private int size;

    public CharSetSquareMatrix(char[][] data) {
        this.data = data;
        this.size = data.length;
    }

    private void fillMatrixWithZeros() {
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                data[i][j] = '!';
            }
        }
    }

    public CharSetSquareMatrix(int size) {
        this.data = new char[size][size];
        this.size = size;
        fillMatrixWithZeros();
    }

    public char[][] getData() {
        return data;
    }

    public int getSize() {
        return size;
    }

    public int getSquare() {
        return size * size;
    }

    public void insert(char value, int i, int j) {
        data[i][j] = value;
    }

    public void insert(char value, int order) {
        data[order / size][order % size] = value;
    }

    public char getByOrder(int order) {
        return data[order / size][order % size];
    }
}
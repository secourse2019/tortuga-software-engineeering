package entity;

/**
 * Simple representation of 2d matrix, stores a state only!
 * @param <T> - generic type
 */
public class Matrix<T> {
    private T[][] array2d;
    private int col;
    private int row;

    public Matrix(T[][] array2d, int col, int row) {
        this.array2d = array2d;
        this.col = col;
        this.row = row;
    }

    public T[][] getMatrix() {
        return this.array2d;
    }

    public int getCol() {
        return this.col;
    }

    public int getRow() {
        return this.row;
    }

    public T get(int i, int j) {
        return this.array2d[i][j];
    }

    public void setSimpleValue(T val, int i, int j) {
        this.array2d[i][j] = val;
    }
}

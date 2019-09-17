package factory;

import entity.Matrix;

public class MatrixFactory {
    public static Matrix<Character> createMatrixWithEmptyChars(int m, int n) {
        Character[][] chars = null;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                chars[i][j] = ' ';
            }
        }
        return new Matrix<Character>(chars, m, n);
    }

    public static Matrix<Character> createMatrixWithPredefinedChars(Character[][] chars2d, int m, int n) {
        return new Matrix<Character>(chars2d, m, n);
    }
}

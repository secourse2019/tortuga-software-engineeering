package service;

import entity.Matrix;

/**
 * Class provides methods to modify the matrix
 */
public class MatrixService<T> {

    public void fillMatrix(Matrix<T> matr, T[][] array2d) {
        for (int i = 0; i < matr.getCol(); i++) {
            for (int j = 0; j < matr.getRow(); j++) {
                matr.setSimpleValue(array2d[i][j], i, j);
            }
        }
    }

    public void printMatrix(Matrix<T> matr) {
        for (int i = 0; i < matr.getCol(); i++) {
            for (int j = 0; j < matr.getRow(); j++) {
                System.out.print(matr.get(i, j) + " ");
            }
            System.out.println();
        }
    }

    public Matrix<T> transpose(Matrix<T> sourceMatr) {
        Matrix<T> resultMatr = new Matrix<T>(sourceMatr.getMatrix(), sourceMatr.getCol(), sourceMatr.getRow());
        for (int i = 0; i < sourceMatr.getCol(); i++) {
            for (int j = 0; j < sourceMatr.getRow(); j++) {
                resultMatr.setSimpleValue(sourceMatr.get(i, j), i, j);
            }
        }
        return resultMatr;
    }
}

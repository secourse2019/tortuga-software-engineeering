package util;

import util.data.types.CharSetSquareMatrix;

public class ForDebug {
    public static void PrintMatrixDebug(CharSetSquareMatrix matrix) {
        for (int i = 0; i < matrix.getSize(); ++i) {
            for (int j = 0; j < matrix.getSize(); ++j) {
                System.out.print(matrix.getData()[i][j]);
            }
            System.out.println();
        }
    }
}

package util;

import util.callables.IFIllArray;

public class Util {
    public static int promoteLength(int val) {
        return (int)Math.ceil(Math.sqrt(val));
    }

    public static String promoteString(String str) {
        int len = promoteLength(str.length());
        StringBuilder resultBuilder = new StringBuilder(str);

        while(resultBuilder.length() != len) {
            resultBuilder.append(' ');
        }

        return resultBuilder.toString();
    }

    // fill matrix
    public static void fillCharMatrix(String text, char[][] box, int rowsCount, int columnsCount, IFIllArray filler) {
        for (int i = 0, textIndex = 0; i != rowsCount; ++i) {
            for (int j = 0; j != columnsCount; ++j) {
                if (textIndex < text.length()) {
                    filler.call(box, i, j, text.charAt(textIndex++));
                } else {
                    filler.call(box, i, j, ' ');
                }
            }
        }
    }

    public static String getResultFromMatrix(char[][] matrix, int column, int row, IGetMessage iGetMessage) {
        return iGetMessage.getMessage(matrix, column, row);
    }
}

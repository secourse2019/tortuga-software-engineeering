package com.company.util;

import java.util.Arrays;

public class Util {

    static public void fillEncodeBox(String text, char[][] box, IFillArray fill) {
        int side = (int)Math.ceil(Math.sqrt((double)text.length()));
        for(int i = 0, temp = 0; i != side; ++i) {
            for(int j = 0; j != side; ++j) {
                if(temp < text.length()) {
                    fill.call(box, i, j, text.charAt(temp++));
                } else {
                    fill.call(box, i, j, ' ');
                }
            }
        }
    }

    static public int makeLength(int value) {
        return (int)Math.ceil(Math.sqrt((double)value));
    }

    static public String getResultFromArray(char[] message) {
        return new String(message);
    }

    static public String getResultFromMatrix(char[][] matrix, int column, int row, IGetMessage get) {
        return get.getMessage(matrix, column, row);
    }

    static public char[] sortCharArray(char[] array) {
        char[] sortKey = new char[array.length];
        for(int i = 0; i != array.length; ++i) {
            sortKey[i] = array[i];
        }
        Arrays.sort(sortKey);
        return sortKey;
    }

    static public void sortBox(char[] key, char[][] result, char[][] box, int column, int row) {
        char[] sortKey = Util.sortCharArray(key);
        for(int i = 0; i != row; ++i) {
            for(int j = 0; j !=row; ++j) {
                if(key[i] == sortKey[j]) {
                    for(int k = 0; k != column; ++k) {
                        result[k][i] = box[k][j];
                        sortKey[j] = 199;
                    }
                }
            }
        }
    }

    private Util() {};
}

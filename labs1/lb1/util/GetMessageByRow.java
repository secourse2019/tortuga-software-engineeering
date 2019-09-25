package com.company.util;

public class GetMessageByRow implements IGetMessage {

    @Override
    public String getMessage(char[][] matrix, int column, int row) {
        String cipher = "";
        for(int i = 0; i != column; ++i) {
            char[] temp = new char[row];
            for(int j = 0; j != row; ++j) {
                temp[j] = matrix[i][j];
            }
            cipher = cipher.concat(new String(temp));
        }
        return cipher;
    }
}

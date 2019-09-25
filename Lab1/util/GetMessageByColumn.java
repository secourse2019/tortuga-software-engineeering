package com.company.util;

public class GetMessageByColumn implements IGetMessage {

    @Override
    public String getMessage(char[][] matrix, int column, int row) {
        String cipher = "";
        for(int i = 0; i != row; ++i) {
            char[] temp = new char[column];
            for(int j = 0; j != column; ++j) {
                temp[j] = matrix[j][i];
            }
            cipher = cipher.concat(new String(temp));
        }
        return cipher;
    }
}

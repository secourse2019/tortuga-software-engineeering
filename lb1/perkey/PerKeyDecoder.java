package com.company.perkey;

import com.company.util.FillArrayByRow;
import com.company.util.GetMessageByColumn;
import com.company.util.Util;

public class PerKeyDecoder {
    private String message;
    private char[] key;

    public void setString(String message) {
        this.message = message;
    }

    public void setKey(String key) {
        this.key = key.toCharArray();
    }

    public void setStringAndKey(String message, String key) {
        this.message = message;
        this.key = key.toCharArray();
    }

    public String getMessage() {
        int column = (int) Math.ceil((double) message.length() / key.length);
        int row = key.length;
        char[][] result = new char[column][row];
        char[][] box = new char[column][row];
        Util.fillEncodeBox(message, box, new FillArrayByRow());
        Util.sortBox(this.key, result, box, column, row);
        return Util.getResultFromMatrix(box, row, column, new GetMessageByColumn());
    }
}
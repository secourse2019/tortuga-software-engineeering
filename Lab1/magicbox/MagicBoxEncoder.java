package com.company.magicbox;

import com.company.util.FillArrayByRow;
import com.company.util.Util;

public class MagicBoxEncoder {
    private String message;
    private int[] key;
    private char[] secondBox;
    private char[][] box;

    public void setString(String message) {
        this.message = message;
    }

    public void setKey(int[] key) {
        this.key = key;
    }

    public void setStringAndKey(String message, int[] key) {
        this.message = message;
        this.key = key;
    }

    public void encodeMessage(int[] a) {
        int length = Util.makeLength(key.length);
        secondBox = new char[length * length];
        box = new char[length][length];
        for (int i = 0, temp = 1; i != length; ++i) {
            for (int j = 0; j != length; ++j) {
                if (temp < message.length() + 1 && key[temp - 1] == i * length + (j + 1)) {
                    secondBox[temp++ - 1] = box[i][j];
                    i = 0;
                    j = -1;
                }
            }
        }
    }

    public String getMessage() {
        Util.fillEncodeBox(message, box, new FillArrayByRow());
        encodeMessage(key);
        return Util.getResultFromArray(secondBox);
    }
}







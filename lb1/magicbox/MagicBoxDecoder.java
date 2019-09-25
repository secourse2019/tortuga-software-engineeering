package com.company.magicbox;

import com.company.util.Util;

public class MagicBoxDecoder {
    private char[] box;
    private int[] key;
    private String message;

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

    private void decodeMessage(String cipher, int[] a) {
        box = new char[key.length];
        for (int i = 0, temp = 1; i != a.length; ++i) {
            if (temp == a[i]) {
                box[temp - 1] = cipher.charAt(i);
                temp++;
                i = -1;
            }
        }
    }

    public String getMessage() {
        decodeMessage(message, key);
        return Util.getResultFromArray(box);
    }
}

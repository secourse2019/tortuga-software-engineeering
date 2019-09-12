package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MagicBoxEncoder {
    private String text;
    private int length;
    private char[] box;
    private char[] secondBox;

    MagicBoxEncoder(String t, int[] a) {
        text = t;
        length = makeLength();
        box = new char[length];
        secondBox =  new char[length];
        fillEncodeBox();
        EncodeMessage(a);
    }

    private int makeLength() {
        return (int)Math.pow(Math.ceil(Math.sqrt((double)text.length())), 2);
    }

    private void fillEncodeBox() {
        int l = (int)Math.ceil(Math.sqrt((double)text.length()));
        for(int i = 0, temp = 0; i != l; i++) {
            for(int j = i; j < length; j  += l) {
                if(temp < text.length()) {
                    box[j] = text.charAt(temp++);
                } else {
                   box[j] = ' ';
                }
            }
        }
    }

    public void EncodeMessage(int[] a) {
        for (int i = 0, temp = 1; i != length; ++i) {
            if (temp == a[i]) {
                secondBox[temp++ - 1] = box[i];
                i = -1;
            }
        }
    }

    public String get() {
        String result = new String(secondBox);
        return result;
    }
}







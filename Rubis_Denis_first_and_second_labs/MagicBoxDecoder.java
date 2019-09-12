package com.company;

public class MagicBoxDecoder {
    private int[] key;
    private char[] box;
    private String message;

    MagicBoxDecoder(String cipher, int[] k) {
        key = k;
        box = new char[key.length];
        decodeMessage(cipher);
    }

    private void decodeMessage(String cipher) {
        for(int i = 1; i != key.length + 1; ++i) {
            for(int j = 0; j != key.length; ++j) {
                if(key[j] == i) {
                    box[i - 1] = cipher.charAt(j);
                }
            }
        }
    }

    public String get() {
        message = new String(box);
        return message;
    }
}
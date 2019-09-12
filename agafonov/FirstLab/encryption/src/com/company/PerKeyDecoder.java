package com.company;
/*
public class PerKeyDecoder {
    private String text;
    private char[] key;
    private int column;
    private int row;
    private char[][] box;

    PerKeyDecoder(String t, String k) {
        text = t;
        key = k.toCharArray();
        column = (int)Math.ceil((double)text.length() / (double)key.length) + 2;
        row = key.length;
        box = new char[column][row];
        fillBox();
        sortBox();
    }

    private void fillPartBox(char[] part, int ind) {
        for(int i = 0; i != row; ++i) {
            box[ind][i] = part[i];
        }
    }

    private void fillBox() {
        char[] sortedKey = sortKeyWord();
        fillPartBox(key, 0);
        fillPartBox(sortedKey, 1);
        for(int i = 2,  temp = 0; i != row; ++i) {
            for(int j = 0; j != column; ++j) {
                if(temp < text.length()) {
                    box[i][j] = text.charAt(temp);
                    temp++;
                } else {
                    box[i][j] = ' ';
                }
            }
        }
    }

    private void sortBox() {
        for(int i = 0; i != row; ++i) {
            for(int j = i; j != row; ++j) {
                if( box[0][i] == box[1][j]) {
                    for(int k = 2; k != column; ++k) {
                        char temp = box[k][j];

                        box[k][j] = box[k][i];
                        box[k][i] = temp;
                    }
                }
            }
        }
    }

    private char[] sortKeyWord() {
        char[] sortedKey = new char[row];
        for(int i = 0; i != sortedKey.length; ++i) {
            sortedKey[i] = key[i];
        }
        for(int i = 0; i != row; ++i) {
            for(int j = 0; j != row - i - 1; ++j) {
                if(sortedKey[j] > sortedKey[j + 1]) {
                    char temp = sortedKey[j];
                    sortedKey[j] = sortedKey[j + 1];
                    sortedKey[j + 1] = temp;
                }
            }
        }
        return sortedKey;
    }

    public String get() {
        String result = "";
        for(int i = 0; i != row; ++i) {
            char[] temp = new char[column - 2];
            for(int j = 2; j != column; ++j) {
                temp[j - 2] = box[j][i];
            }
            result = result.concat(new String(temp));
        }
        return result;
    }
}

 */
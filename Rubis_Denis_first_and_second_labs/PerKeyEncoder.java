package com.company;

public class PerKeyEncoder {
    private String text;
    private char[] keyWord;
    private int column;
    private int row;
    private char[][] box;

    PerKeyEncoder(String t, String k) {
        text = t;
        keyWord = k.toCharArray();
        column = (int)Math.ceil((double)text.length() / (double)keyWord.length) + 1;
        row = keyWord.length;
        box = new char[column][row];
        fillBox();
        sortKeyWord();
        sortBox();
    }

    private void fillBox() {
        for(int i = 0; i != row; ++i) {
            box[0][i] = keyWord[i];
        }

        for(int i = 0, temp = 0; i != row; ++i) {
            for(int j = 1; j != column; ++j) {
                if(temp < text.length()) {
                    box[j][i] = text.charAt(temp);
                    temp++;
                } else {
                    box[j][i] = ' ';
                }
            }
        }
    }

    private void sortBox() {
        for(int i = 0; i != row; ++i) {
            for(int j = 0; j != row; ++j) {
                if(keyWord[i] == box[0][j]) {
                    for(int k = 0; k != column; ++k) {
                        char temp = box[k][j];
                        box[k][j] = box[k][i];
                        box[k][i] = temp;
                    }
                }
            }
        }
    }

    private void sortKeyWord() {
        for(int i = 0; i != keyWord.length; ++i) {
            for(int j = 0; j != keyWord.length - i - 1; ++j) {
                if(keyWord[j] > keyWord[j + 1]) {
                    char temp = keyWord[j];
                    keyWord[j] = keyWord[j + 1];
                    keyWord[j + 1] = temp;
                }
            }
        }
    }

    public String get() {
        String result = "";
        for(int i = 1; i != column; ++i) {
            result = result.concat(new String(box[i]));
        }
        return result;
    }
}

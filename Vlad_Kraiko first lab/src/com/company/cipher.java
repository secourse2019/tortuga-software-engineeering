package com.company;

class Cipher {
    int row;
    int col;
    private char[] key;
    private char[][] box;
    String text;
    Cipher(String text_, int row_, int col_) {
        row = row_;
        col = col_;
        text = text_;
    }

    public void Encode() {
        box = new char[row][col];
        for (int t = 0, j = 0; t < col; ++t) {
            for (int k = 0; k < row; ++k, ++j) {
                box[k][t] = text.charAt(j);
            }
        }
        for (int t = 0, j = 0; t < row; ++t) {
            for (int k = 0; k < col; ++k, ++j)
                System.out.print(box[t][k]);
        }
        System.out.println();
    }
     public Cipher(String t, String k) {
        text = t;
        key = k.toCharArray();
        col = (int)Math.ceil((double)text.length() / (double)key.length) + 1;
        row = key.length;
        box = new char[col][row];
        FillBox();
        SortKeyWord();
        SortBox();
    }

    private void FillBox() {
        for(int i = 0; i != row; ++i) {
            box[0][i] = key[i];
        }

        for(int i = 0, temp = 0; i != row; ++i) {
            for(int j = 1; j != col; ++j) {
                if(temp < text.length()) {
                    box[j][i] = text.charAt(temp);
                    temp++;
                } else {
                    box[j][i] = ' ';
                }
            }
        }
    }

    private void SortBox() {
        for(int i = 0; i != row; ++i) {
            for(int j = 0; j != row; ++j) {
                if(key[i] == box[0][j]) {
                    for(int k = 0; k != col; ++k) {
                        char temp = box[k][j];
                        box[k][j] = box[k][i];
                        box[k][i] = temp;
                    }
                }
            }
        }
    }

    private void SortKeyWord() {
        for(int i = 0; i != key.length; ++i) {
            for(int j = 0; j != key.length - i - 1; ++j) {
                if(key[j] > key[j + 1]) {
                    char temp = key[j];
                    key[j] = key[j + 1];
                    key[j + 1] = temp;
                }
            }
        }
    }

    public String Encode_key() {
        String result = "";
        for(int i = 1; i != col; ++i) {
            result = result.concat(new String(box[i]));
        }
        return result;
    }
}


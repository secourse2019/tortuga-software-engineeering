package com.company;

class Cipher {
    int row;
    int col;
    private char[] key;
    private char[][] box;
    String text;
   public Cipher(String text, int row, int col) {
        this.row = row;
        this.col = col;
        this.text = text;
    }

    public void encode() {
        box = new char[row][col];
        for (int t = 0, j = 0; t < col; ++t) {
            for (int k = 0; k < row; ++k, ++j) {
                box[k][t] = text.charAt(j);
            }
        }
    }
     public Cipher(String t, String k) {
        text = t;
        key = k.toCharArray();
        col = (int)Math.ceil((double)text.length() / (double)key.length) + 1;
        row = key.length;
        box = new char[col][row];
        fillBox();
        sortKeyWord();
        sortBox();
    }

    private void fillBox() {
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

    private void sortBox() {
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

    private void sortKeyWord() {
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

    public String encode_Key() {
        String result = "";
        for(int i = 1; i != col; ++i) {
            result = result.concat(new String(box[i]));
        }
        return result;
    }
    public void print(){
        for (int t = 0, j = 0; t < row; ++t) {
            for (int k = 0; k < col; ++k, ++j)
                System.out.print(box[t][k]);
        }
        System.out.println();
    }
}


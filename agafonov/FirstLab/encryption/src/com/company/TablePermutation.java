package com.company;

public class TablePermutation {
    private String text;
    private char[][] box;
    private char[] key;
    private int column;
    private int row;

    TablePermutation(String text, String key){
        this.text = text;
        this.key = key.toCharArray();

        column = this.key.length;
        row = (int)Math.ceil((double)this.text.length() / (double)this.key.length) + 1;

        box = new char[row][column];

        fillbox();
        sortkey();
        sortbox();
    }

    private void fillbox(){
        for(int i = 0; i != column; ++i) {
            box[0][i] = key[i];
        }

        for(int i = 0, temp = 0; i != column; ++i) {
            for(int j = 1; j != row; ++j) {
                if(temp < text.length()) {
                    box[j][i] = text.charAt(temp);
                    temp++;
                } else {
                    box[j][i] = ' ';
                }
            }
        }
    }
    private void sortbox() {
        for(int i = 0; i != column; ++i) {
            for(int j = 0; j != column; ++j) {
                if(this.key[i] == box[0][j]) {
                    for(int k = 0; k != row; ++k) {
                        char temp = box[k][j];
                        box[k][j] = box[k][i];
                        box[k][i] = temp;
                    }
                }
            }
        }
    }

    private void sortkey() {
        for(int i = 0; i != this.key.length; ++i) {
            for(int j = 0; j != this.key.length - i - 1; ++j) {
                if(this.key[j] > this.key[j + 1]) {
                    char temp = this.key[j];
                    this.key[j] = this.key[j + 1];
                    this.key[j + 1] = temp;
                }
            }
        }
    }

    public void get() {
        String result = "";
        for(int i = 1; i != row ; ++i) {
            result = result.concat(new String(box[i]));
        }
        System.out.println(result);
    }

}

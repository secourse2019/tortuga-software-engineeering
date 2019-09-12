package com.company;

public class SympleDecoder {
    private char[] text;
    private int column;
    private int row;
    private char[][] box;

    SympleDecoder(String t, int r, int c){
        text = t.toCharArray();
        column = c;
        row = r;
        box = new char[row][column];

        fillbox();
        getArr();
        System.out.println(get());
    }

    private void fillbox (){
        for(int i = 0, temp = 0; i != row; ++i){
            for(int j = 0; j != column; ++j){
                    box[i][j] = text[temp++];
            }
        }

    }

    private void getArr (){
        for(int i = 0, temp = 0; i != row; ++i){
            System.out.println("\n");
            for(int j = 0; j != column; ++j){
                System.out.print(box[i][j]);
            }
        }
    }
    public String get() {
        int temp = 0;
        char[] res = new char[text.length];
        for (int i = 0; i != column; ++i){
            for (int j = 0; j != row; ++j){
                res[temp++] = box[j][i];
            }
        }
        return new String(res);
    }
}

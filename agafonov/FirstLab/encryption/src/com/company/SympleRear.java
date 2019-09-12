package com.company;

public class SympleRear {
    private int row;
    private int column;
    private char[][] box;
    private char[] text;

    SympleRear(String t, int r, int c){
        row = r;
        column = c;
        box = new char[row][column];
        text = t.toCharArray();

        fillbox();
        getArr();
        System.out.println("\n");
        System.out.println(get());
    }

    private void fillbox (){
        for(int i = 0, temp = 0; i != column; ++i){
            for(int j = 0; j != row; ++j){
                if (temp != text.length){
                    box[j][i] = text[temp++];
                }
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
        String result = "";
        for(int i = 0; i != row; ++i) {
                result = result.concat(new String(box[i]));
        }
        return result;
    }
}

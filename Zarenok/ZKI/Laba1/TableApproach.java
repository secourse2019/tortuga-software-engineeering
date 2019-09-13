package com.company;

public class TableApproach {
    char[][] arr;
    String text;
    int row;
    int column;
    public TableApproach(String text, int column, int row) {
        this.text = text;
        this.column = column;
        this.row = row;
        this.arr = new char[column][row];
        fillArray();
    }

    public void fillArray(){
        int temp = 0;
        for(int i = 0; i != row; ++i){
            for(int j = 0; j != column; ++j){
                if(temp < text.length()){
                    arr[j][i] = text.charAt(temp);
                    ++temp;
                }
            }
        }
    }

    public String getSecretMessage(){
        String result = "";
        for(int i = 0; i != column; ++i) {
            for(int j = 0; j != row; ++j){
                result += arr[i][j];
            }
        }
        return result;
    }
}

package com.company;

public class TableApproachReverse {
    String text;
    int column;
    int row;
    char[][] arr;

    public TableApproachReverse(String text, int column, int row){
        this.text = text;
        this.column = column;
        this.row = row;
        this.arr = new char[column][row];
        fillArray();
    }


    public void fillArray() {
        int temp = 0;
        for(int i = 0; i != column; ++i){
            for(int j = 0; j != row; ++j){
                //if(temp < text.length()){
                    arr[i][j] = text.charAt(temp);
                    ++temp;
                //}
               // else{
                //    arr[i][j] = ' ';
               // }
            }
        }
    }

    public String getCorrectAnswer(){
        String result = " ";
        for(int i = 0; i != row; ++i) {
            for(int j = 0; j != column; ++j){
                result += arr[j][i];
            }
        }
        return result;
    }
}

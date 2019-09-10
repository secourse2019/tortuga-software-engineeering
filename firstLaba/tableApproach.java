package com.company;

public class tableApproach {
    char[][] arr;
    String text;
    int row;
    int column;
    public tableApproach(String _text) {
        text = _text;
        column = createSide();
        row = createSide();
        arr = new char[column][row];
        fillArray();
    }

    public int createSide() {
        return (int)Math.ceil(Math.sqrt((double)text.length()));
    }

    public void fillArray(){
        int temp = 0;
        for(int i = 0; i != column; ++i){
            for(int j = 0; j != row; ++j){
                if(temp < text.length()){
                    arr[i][j] = text.charAt(temp);
                    ++temp;
                }
                else {
                    arr[i][j] = '.';
                }
            }
        }
    }

    public String getSecretMessage(){
        String result = "";
        for(int i = 0; i != row; ++i) {
            for(int j = 0; j != column; ++j){
                result += arr[j][i];
            }
        }
        return result;
    }

}

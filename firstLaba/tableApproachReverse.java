package com.company;

public class tableApproachReverse {
    String text;
    int column;
    int row;
    char[][] arr;

    public tableApproachReverse(String _text){
        text = _text;
        column = createSide();
        row = createSide();
        arr = new char[column][row];
        fillArray();
    }

    public int createSide() {
        return (int)Math.ceil(Math.sqrt((double)text.length()));
    }

    public void fillArray() {
        int temp = 0;
        for(int i = 0; i != column; ++i){
            for(int j = 0; j != row; ++j){
                if(temp < text.length()){
                    arr[i][j] = text.charAt(temp);
                    ++temp;
                }
            }
        }
    }

    public void getCorrectAnswer(){
        for(int i = 0; i != row; ++i) {
            for(int j = 0; j != column; ++j){
                System.out.print(arr[j][i]);
            }
        }
    }
}

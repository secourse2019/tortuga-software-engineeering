package com.company;

public class KeyAppproachReverse {
    String key;
    String text;
    char[] reverseWorld;
    int column;
    int row;
    char[][] arr;

    public KeyAppproachReverse(String _key, String _text, int _row, int _column) {
        key = _key;
        text = _text;
        reverseWorld = _key.toCharArray();
        sortRevWord();
        column = _column;
        row = _row;
        arr = new char[row][column];
        inputArr();
        sortArray();
    }

    public void sortRevWord() {
        for (int i = 0; i != reverseWorld.length; ++i) {
            for (int j = 0; j != reverseWorld.length - 1; ++j) {
                if (reverseWorld[j] > reverseWorld[j + 1]) {
                    char temp = reverseWorld[j];
                    reverseWorld[j] = reverseWorld[j + 1];
                    reverseWorld[j + 1] = temp;
                }
            }
        }

    }

    public void inputArr() {
        for(int i = 0; i != key.length(); ++i){
            arr[0][i] = key.charAt(i);
        }
        for(int i = 0; i != column; ++i) {
            arr[1][i] = reverseWorld[i];
        }
        int k = 0;
        for (int i = 2; i != row; ++i) {
            for (int j = 0; j != column; ++j) {
               arr[i][j] = text.charAt(k);
               ++k;
            }
        }
    }

    public void sortArray(){
        for(int i = 0; i != column; ++i){
            for(int j = i; j != column; ++j){
                if(arr[0][i] == arr[1][j]){
                    for(int k = 1; k != row; ++k)
                    {
                        char temp = arr[k][j];
                        arr[k][j] = arr[k][i];
                        arr[k][i] = temp;
                    }
                }
            }
        }
    }

    public void printArray(){
        for(int i = 0; i != column; ++i){
            for(int j = 2; j != row; ++j){
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }


}

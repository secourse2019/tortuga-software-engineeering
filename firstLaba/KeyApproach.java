package com.company;

public class KeyApproach {
        String text;
        char[] key;
        char[] reverseWord;
        int columns;
        int rows;
        char[][] arr;
        public KeyApproach(String _text, String _key, int _rows, int _columns)
        {
            text = _text;
            key = _key.toCharArray();
            columns = _columns;
            rows = _rows;
            arr = new char[rows][columns];
            reverseWord = text.toCharArray();
            sortRevKeyWord();
            inputArr();
            buildAnswer();

        }

        public void inputArr() {
            for(int i = 0; i != columns; ++i) {
                arr[0][i] = reverseWord[i];
            }
            int k = 0;
            for(int i = 0; i != rows; ++i) {
                for(int j = 1; j != columns; ++j) {
                    arr[i][j] = text.charAt(k);
                    ++k;
                }
            }
        }

        public void sortRevKeyWord() {
            for(int i = 0; i != reverseWord.length-1; ++i){
                for(int j = 0; j != reverseWord.length-i-1; ++j) {
                    if(reverseWord[j] > reverseWord[j+1]) {
                        char temp = reverseWord[j];
                        reverseWord[j] = reverseWord[j+1];
                        reverseWord[j+1] = temp;
                    }
                }
            }
        }

        public void buildAnswer(){
            for(int i = 0; i != columns; ++i) {
                for(int j = 0; j != columns; ++j) {
                    if(reverseWord[j] < arr[0][j]) {
                        for(int k = 0; k != rows; ++k){
                            char temp = arr[k][j];
                            arr[k][j] = arr[k][i];
                            arr[k][i] = temp;
                        }
                    }
                }
            }
        }

    public String getAnswer() {
        String result = "";
        for(int i = 1; i != columns; ++i) {
            result = result.concat(new String(arr[i]) + "\n");
        }
        return result;
    }
}

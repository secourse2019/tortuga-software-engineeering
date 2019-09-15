package com.company;

public class KeyApproach {
    String text;
    char[] key;
    char[] reverseWord;
    int column;
    int row;
    char[][] arr;

    public KeyApproach(String text, String _key, int row, int column) {
        this.text = text;
        key = _key.toCharArray();
        this.column = column;
        this.row = row;
        this.arr = new char[row+2][column];
        this.reverseWord = _key.toCharArray();
    }

    public void incoder() {
        for (int i = 0; i != column; ++i) {
            arr[0][i] = reverseWord[i];
        }
        int k = 0;
        for (int i = 0; i != row+2; ++i) {
            for (int j = 1; j != column; ++j) {  // input array
                if(k < text.length()){
                    arr[i][j] = text.charAt(k);
                    ++k;
                }
                else{
                    arr[i][j] = ' ';
                }
            }
        }
        buildAnswer();
        System.out.println(incoderAnswer());
    }

    private void buildAnswer() {
        for (int i = 0; i != column; ++i) {
            for (int j = 0; j != column; ++j) {
                if (reverseWord[j] < arr[0][j]) {
                    for (int k = 0; k != row+2; ++k) {
                        char temp = arr[k][j];
                        arr[k][j] = arr[k][i];
                        arr[k][i] = temp;
                    }
                }
            }
        }
    }

    public String incoderAnswer() {
        buildAnswer();
        String result = "";
        for (int i = 1; i != column; ++i) {
            result = result.concat(new String(arr[i]) + "\n");
        }
        return result;

    }

    public void decoder() {
        sortRevKeyWord();
        for(int i = 0; i != key.length; ++i){
            arr[0][i] = key[i]; // input keyword
        }
        for(int i = 0; i != column; ++i) {
            arr[1][i] = reverseWord[i]; // input sortkeyword
        }
        int k = 0;
        for (int i = 2; i != row+2; ++i) {
            for (int j = 0; j != column; ++j) {
                arr[i][j] = text.charAt(k);
                ++k;
            }
        }
        sortArray();
        decoderAnswer();
    }

    private void sortArray(){
        for(int i = 0; i != column; ++i){
            for(int j = i; j != column; ++j){
                if(arr[0][i] == arr[1][j]){ // compare letters by column and sort columns
                    for(int k = 1; k != row+2; ++k)
                    {
                        char temp = arr[k][j];
                        arr[k][j] = arr[k][i]; // swap
                        arr[k][i] = temp;
                    }
                }
            }
        }
    }

    private void decoderAnswer(){
        for(int i = 0; i != column; ++i){
            for(int j = 2; j != row+2; ++j){ // first two rows contain key words
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }

    public void sortRevKeyWord() {
        for (int i = 0; i != reverseWord.length - 1; ++i) {
            for (int j = 0; j != reverseWord.length - i - 1; ++j) {
                if (reverseWord[j] > reverseWord[j + 1]) {        // sort key word
                    char temp = reverseWord[j];
                    reverseWord[j] = reverseWord[j + 1];
                    reverseWord[j + 1] = temp;
                }
            }
        }
    }
}
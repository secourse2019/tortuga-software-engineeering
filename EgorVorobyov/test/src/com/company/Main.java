package com.company;

class EncryptionTable {
    public void encryption(String[] arr,int col, int row) {
        char[][] matrixA = new char[row][col];

        String text = new String(arr[0]);
        char[] textarr = text.toCharArray();

        String key = new String(arr[1]);
        char[] keyarr = key.toCharArray();

        char[] encryption_key = new char[keyarr.length];

        String alphabet = new String("abcdefghijklmnopqrstuvwxyz");
        char[] alphabetarr = alphabet.toCharArray();
        int d = 0;
        for(int i = 0; i != alphabetarr.length; ++i){
            for(int j = 0; j != keyarr.length; ++j){
                if(alphabetarr[i] == keyarr[j]){
                    encryption_key[d++] = keyarr[j];
                }
            }
        }

        for(int i = 0, c = 0; i != col; ++i){
            for(int j = 0; j != row; ++j, ++c){
                matrixA[j][i] = textarr[c];
            }
        }

        for(int i = 0; i != encryption_key.length; ++i) {
            for(int j = i; j != keyarr.length; ++j){
                if(encryption_key[i]  == keyarr[j] && i != j){
                    for (int c = 0; c != row; ++c) {
                        char temp = matrixA[c][j];
                        matrixA[c][j] = matrixA[c][i];
                        matrixA[c][i] = temp;
                        char temp1 = encryption_key[j];
                        encryption_key[j] = encryption_key[i];
                        encryption_key[i] = temp1;
                    }
                }
            }
        }

        for(int i = 0; i != row; ++i){
            for(int j = 0; j != col; ++j){
                System.out.println(matrixA[i][j]);
            }
        }
    }

    public void description(String[] arr,int col, int row){
        char[][] matrixA = new char[row][col];

        String text = new String(arr[0]);
        char[] textarr = text.toCharArray();

        String key = new String(arr[1]);
        char[] keyarr = key.toCharArray();

        char[] encryption_key = new char[keyarr.length];

        String alphabet = new String("abcdefghijklmnopqrstuvwxyz");
        char[] alphabetarr = alphabet.toCharArray();
        int d = 0;
        for(int i = 0; i != alphabetarr.length; ++i){
            for(int j = 0; j != keyarr.length; ++j){
                if(alphabetarr[i] == keyarr[j]){
                    encryption_key[d++] = keyarr[j];
                }
            }
        }

        for(int i = 0, c = 0; i != row; ++i){
            for(int j = 0; j != col; ++j, ++c){
                matrixA[i][j] = textarr[c];
            }
        }

        for(int i = 0; i != keyarr.length; ++i) {
            for(int j = i; j != encryption_key.length; ++j){
                if(encryption_key[i]  == keyarr[j] && i != j){
                    for (int c = 0; c != row; ++c) {
                        char temp = matrixA[c][j];
                        matrixA[c][j] = matrixA[c][i];
                        matrixA[c][i] = temp;
                        char temp1 = keyarr[j];
                        keyarr[j] = keyarr[i];
                        keyarr[i] = temp1;
                    }
                }
            }
        }

        for(int i = 0; i != col; ++i){
            for(int j = 0; j != row; ++j){
                System.out.println(matrixA[j][i]);
            }
        }

    }
}

class MagicBox {
    public void magic_box_encription(String text, int[] magicArr) {
        char[] textArr = text.toCharArray();
        char[] resultArr = new char[textArr.length];


        for(int i = 0; i != magicArr.length; ++i){
            for(int j = 0; j != textArr.length; ++j){
                if(magicArr[i] == j + 1){
                    resultArr[i] = textArr[j];
                }
            }
        }

        for(int i = 0; i != resultArr.length; ++i){
            System.out.println(resultArr[i]);
        }
    }

    public void magic_box_decription(String text, int[] magicArr) {
        char[] textArr = text.toCharArray();
        char[] arr = new char[magicArr.length];
        for(int i = 0; i != magicArr.length; ++i) {
            for(int j = 0; j != textArr.length; ++j) {
                if(magicArr[i] == j + 1) {
                    arr[j] = textArr[i];
                }
            }
        }
        for(int i = 0; i != arr.length; ++i){
            System.out.println(arr[i]);
        }
    }
}



public class Main {

    public static void main(String[] args) {
        EncryptionTable v = new EncryptionTable();
        v.description(args,5, 4);

        String text = "Времена Меняются";
        int[] magicArr = {9, 16, 2, 7, 6, 3, 13, 12, 15, 10, 8, 1, 4, 5, 11, 14};

        String text1 = "АЕЧЖД_ССИЬ_ОВВМ_";
        int[] magicArr1 = {16, 3, 2, 13, 5, 10, 11, 8, 9, 6, 7, 12, 4, 15, 14, 1};

        //MagicBox g = new MagicBox();
        //g.magic_box_encription(text, magicArr);
        //g.magic_box_decription(text1, magicArr1);
    }
}
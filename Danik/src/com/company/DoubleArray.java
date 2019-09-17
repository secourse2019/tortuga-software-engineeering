package com.company;

public class DoubleArray {
    char array[][];
    private int rows;
    private int columns;

    private String codeWord = "";

    private String cipher = "";

    public DoubleArray(int rows, int columns, String text) {


        this.rows = rows;
        this.columns = columns;

        codeWord = text;
        array = new char[rows][columns];
        char arr[] = text.toCharArray();

        for (int i = 0, k = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++, k++) {
                array[j][i] = '.';

                if (k < arr.length) {
                    array[j][i] = arr[k];
                }
            }
        }
    }

    public void printMatrix() {
        printUniversal(this.rows, this.columns, this.array);
    }

    public String convertKey(String key) {
        String resultCipher = "";
        char[] arrOfChar = key.toCharArray();
        int [] arrOfInt = new int[key.length()];

        char [][]res = new char[this.rows][key.length()];
        char [] keyToChar = codeWord.toCharArray();

        for (int i = 0; i < key.length(); i++) {
            arrOfInt[i] = (int) arrOfChar[i];
        }

        res[0] = arrOfChar;
        for (int i = 0, k = 0; i < key.length(); i++) {
            for (int j = 1; j < this.rows; j++, k++) {
                res[j][i] = keyToChar[k];
            }
        }

        bubbleSort(arrOfInt,res,this.rows);

        printUniversal(this.rows, key.length(), res);

        for (int i = 0; i < key.length(); i++) {
            for (int j = 1; j < this.rows; j++) {
                resultCipher += res[j][i];
            }
        }

        return resultCipher;

    }

    public String deconvertKey(String key, int rows) {

        char[][] res = new char[rows][key.length()];
        char[] arr = codeWord.toCharArray();

        printMatrix();
        return "";
    }

    private int[] strToInt(String str) {
        char[] arr = str.toCharArray();
        int[] res = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            res[i] = arr[i];
        }
        return res;
    }

    private void bubbleSort(int[] array, char[][]dArray, int rows) {

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]) {
                    char[] temp = new char[rows];

                    int tempSim = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tempSim;

                    for (int k = 0; k < rows; k++) {
                        temp[k] = dArray[k][j+1];
                        dArray[k][j+1] = dArray[k][j];
                        dArray[k][j] = temp[k];

                    }
                }
            }
        }
    }


    public String convert() {

        for (int i = 0; i < this.columns; i++) {
            for (int j = 0; j < this.rows; j++) {
                if (array[j][i] != '.') {
                    cipher += array[j][i];
                }
            }
        }
        return cipher;
    }

    public String deconverter(int rows, int columns, String str) {

        String result = "";
        char arr[] = str.toCharArray();
        Character resArr[][] = new Character[rows][columns];

        for (int i = 0, k = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++, k++) {
                resArr[i][j] = arr[k];
            }
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                result += resArr[j][i];
            }
        }

        return result;
    }


    private void printUniversal(int rows, int columns, char[][] arr) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String magicBox(String key, int rows) {

        return "";
    }

}

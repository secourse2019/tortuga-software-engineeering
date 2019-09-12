package com.company;

public class SqardShif {


    public static char[][] GetMatrix(String s1, String key) {
        int s_size = s1.length();
        int key_size = key.length();
        int a1 = (s_size / key_size) + 2;


        char[][] arr = new char[a1][key_size];

        for (int i = 0; i < key_size; i++) {
            arr[0][i] = key.charAt(i);

        }

        int thisChar = 0;

        for (int i = 0; i < key_size; i++) {
            for (int j = 1; j < a1; j++) {
                if (thisChar < s_size) {
                    arr[j][i] = s1.charAt(thisChar);
                    thisChar++;

                } else {
                    arr[j][i] = '.';
                }

            }

        }


        return arr;
    }


    public static int[] SortKey(char arr1[]) {

        char[] arr = new char[arr1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1[i];
        }
        int[] res = new int[arr.length];


        char min = arr[0];
        int minInd = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int k = 0; k < arr.length; k++) {
                if (arr[k] != '\u0000') {
                    min = arr[k];
                    minInd = k;

                }
            }

            if (min == arr[0]) {
                break;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != '\u0000') {
                    if (arr[j] < min) {
                        min = arr[j];
                        minInd = j;

                    }
                }

            }
            res[i] = minInd;
            arr[minInd] = '\u0000';
        }

        return res;
    }


    public static char[][] SortByKey(char[][] arr) {
        int[] sortKey = SortKey(arr[0]);
        System.out.println();
        char[][] res = new char[arr.length][(arr[0]).length];
        for (int i = 0; i < (arr[0]).length; i++) {
            for (int j = 0; j < arr.length; j++) {
                res[j][i] = arr[j][sortKey[i]];

            }
        }
        System.out.println();


        return res;
    }

    public static String MadeShif(String s1, String key) {
        char[][] res = GetMatrix(s1, key);

        System.out.println( );


        char[][] res2 = SortByKey(res);


        String text = "";



        for (int i = 0; i < res2[0].length; i++)
        {
            for (int j = 0; j < res2.length; j++)
            {
                text += res2[j][i];
            }
        }

        return text;

    }
}
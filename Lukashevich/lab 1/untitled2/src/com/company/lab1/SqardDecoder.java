package com.company.lab1;

import com.company.Deshif;
import sun.tools.jconsole.JConsole;

public class SqardDecoder implements Deshif<String> {

    String text;
    String key;
    private String result;

    public SqardDecoder (String text, String key)
    {
        SetKey(key);
        SetText(text);
        SetResult(MakeDeshif ());
    }

    @Override
    public void SetResult (String res)
    {
        this.result = res;
    }

    @Override
    public String GetResult ()
    {
        return this.result;
    }

    @Override
    public void SetKey(String key) {
        this.key = key;
    }

    @Override
    public void SetText(String text) {
        this.text = text;
    }

    @Override
    public  String MakeDeshif ()
    {
        char[] keyArr = key.toCharArray();
        int s_size = text.length();
        int key_size = key.length();
        int matrixRow = (s_size / key_size) ;

        char[][] arr = new char[matrixRow][key_size];

        int thisChar = 0;

        for (int i = 0; i < key_size; i++) {
            for (int j = 0; j < matrixRow; j++) {
                if (thisChar < s_size) {
                    arr[j][i] = text.charAt(thisChar);
                    thisChar++;

                } else {
                    arr[j][i] = '.';
                }

            }

        }

        String result = "";

        for (int i = 0; i < keyArr.length; i++)
        {
            for ( int j = 0; j < keyArr.length; j++ )
            {
                if (keyArr[i] == arr[0][j]) {

                    for (int f = 1; f < arr.length; f++ )
                    {
                        result += arr[f][j];
                    }

                    arr[0][j] = '\u0000';
                }
            }
        }

        return result;

    }



}

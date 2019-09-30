package com.company.lab1;

import com.company.Shifrator;

import java.lang.reflect.Array;

public class MagicBoxShifr implements Shifrator<Integer[][]> {

    String text;
    Integer[][] key;
    private String result;

    public MagicBoxShifr (String text, Integer[][] key){

        SetKey(key);
        SetText(text);
        SetResult(MadeShif());
    }

    @Override
    public void SetText (String text){
        this.text = text;
    }

    @Override
    public void SetKey (Integer[][] key){
        this.key = key;
    }

    @Override
    public void SetResult (String res){
        this.result = res;
    }

    @Override
    public String GetResult (){
        return this.result;
    }

    @Override
    public String MadeShif (){

        int matrixValue = (key.length * key[0].length);
        if (text.length() < matrixValue) {

            for (int i = text.length(); i < matrixValue; i++)
            {
                text += '.';
            }

        }else if (text.length() > matrixValue) {

            int delta = text.length() - matrixValue;
            text = text.substring(0, text.length() - delta);
        }

        String result = "";

        for (int i = 0; i < key.length; i++)
        {
            for (int j = 0; j < key[0].length; j++)
            {
                result += text.charAt( (key[i][j]) - 1 );
            }
        }


        return result;

    }

}

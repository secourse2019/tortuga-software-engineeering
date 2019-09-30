package com.company.lab1;

import com.company.Deshif;

public class MagicBoxDeshif implements Deshif<Integer[][]> {


    String text;
    Integer[][] key;
    String result;

    public MagicBoxDeshif (String text, Integer[][] key) {

        SetKey(key);
        SetText(text);
        SetResult(MakeDeshif());
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
    public String MakeDeshif (){
        int matrixValue = (key.length * key[0].length);
        if (text.length() != matrixValue) {

            return "Error : key uncorect";
        }


        char [] result = new char[text.length()];


        int thisChar = 0;

        for (int i = 0; i < key.length; i++)
        {
            for (int j = 0; j < key[0].length; j++)
            {
                result [ (key[i][j] - 1) ]  =  text.charAt( thisChar );
                thisChar++;
            }
        }

        return new String(result);
    }
}

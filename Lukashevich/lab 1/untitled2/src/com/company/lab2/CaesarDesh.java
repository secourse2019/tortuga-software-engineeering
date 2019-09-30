package com.company.lab2;

import com.company.Deshif;

public class CaesarDesh implements Deshif<Integer> {

    String text;
    Integer key;
    private String result;

    public CaesarDesh (String text, Integer key) {

        SetKey(key);
        SetText(text);
        SetResult(MakeDeshif());
    }

    @Override
    public void SetText (String text){
        this.text = text;
    }

    @Override
    public void SetKey (Integer key){
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

        String res = "";
        for (int i = 0; i < text.length(); i++)
        {
            res += (char)((int)(text.charAt(i)) - key);
        }

        return res;
    }
}

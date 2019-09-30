package com.company.lab2;

import com.company.Shifrator;

public class CaesarShif implements Shifrator<Integer> {

    String text;
    Integer key;
    private String result;

    public CaesarShif (String text, Integer key) {

        SetKey(key);
        SetText(text);
        SetResult(MadeShif());
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
    public String MadeShif (){

        String res = "";
        for (int i = 0; i < text.length(); i++)
        {
            res += (char)((int)(text.charAt(i)) + key);
        }

        return res;
    }
}

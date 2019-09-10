package com.company;

public class MagicSquareReverse {
    String text;
    int[] magicCode;
    char[] result;
    public MagicSquareReverse(String _text, int[] _magicCode){
        text = _text;
        magicCode = _magicCode;
        result = new char[text.length()];
        inputResult();
    }
    public void inputResult(){
        for(int i = 0; i <= result.length; ++i){
            for(int j = 0; j != result.length; ++j){
                if(magicCode[j] == i) {
                    result[i-1] = text.charAt(j);
                }
            }
        }
    }

    public String getResult(){
        String res = "";
        for(int i = 0; i != result.length; ++i)
        {
            res += result[i];
        }
        return res;
    }
}

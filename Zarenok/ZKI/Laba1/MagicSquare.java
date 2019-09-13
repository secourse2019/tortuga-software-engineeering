package com.company;

public class MagicSquare {
    String text;
    int[] magicCode;
    char[] result;
    public MagicSquare(String text, int[] magicCode){
        this.text = text;
        this.magicCode = magicCode;
        this.result = new char[text.length()];
        inputResult();
        getResult();
    }

    public void inputResult(){
        for(int j = 0; j != result.length; ++j){
            for(int i = 1; i <= result.length; ++i){
                if(magicCode[j] == i){
                    result[j] = text.charAt(i-1);
                }
            }
        }
    }

    public String getResult(){
        String res = "";
        for(int i = 0; i != result.length; ++i){
            res += result[i];
        }
        return res;
    }

    public void printResult(){
        System.out.println(result);
    }
}

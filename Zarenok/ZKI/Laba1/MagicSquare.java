package com.company;

public class MagicSquare {
    String text;
    int[] magicCode;
    StringBuilder result;
    public MagicSquare(String text, int[] magicCode){
        this.text = text;
        this.magicCode = magicCode;
        this.result = new StringBuilder();
        inputResult();
        getResult();
    }

    public void inputResult(){
        for(int j = 0; j != result.length(); ++j){
            for(int i = 1; i <= result.length(); ++i){
                if(magicCode[j] == i){
                    result.append(text.charAt(i-1));
                }
            }
        }
    }

    public String getResult(){
        return result.toString();
    }

    public void printResult(){
        System.out.println(result.toString());
    }
}

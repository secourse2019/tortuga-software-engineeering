package com.company;

public class MagicQuadrateEncoder {

    public char[] box;
    public char[] text;
    public int[] MagicBox;
    MagicQuadrateEncoder (String t, int[] mb){
        text = t.toCharArray();
        MagicBox = mb;
        box = new char[mb.length];

        FillMagicBox();
    }

    public void FillMagicBox(){
        for(int i = 0; i != box.length; ++i){
            for(int j = 0; j != box.length; ++j){
                if(MagicBox[i] == j){
                    box[i] = text[j-1];
                }
            }
        }
    }
    public String GetBox(){
        return new String(box);
    }
}

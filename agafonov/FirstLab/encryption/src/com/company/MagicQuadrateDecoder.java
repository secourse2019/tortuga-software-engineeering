package com.company;

public class MagicQuadrateDecoder {

    public char[] box;
    public char[] text;
    public int[] MagicBox;

    MagicQuadrateDecoder (String t, int[] mb){
        text = t.toCharArray();
        MagicBox = mb;
        box = new char[mb.length];

        FillMagicBox();
    }

    public void FillMagicBox(){
        for(int i = 0; i != box.length; ++i){
            for(int j = 0; j != box.length; ++j){
                if(MagicBox[j] == i){
                    box[i-1] = text[j];
                }
            }
        }
    }

    public String GetBox() {
        return new String(box);
    }
}

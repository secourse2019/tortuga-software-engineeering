package com.company;

public interface Deshif<KeyType> {

    void SetText (String text);
    void SetKey (KeyType key);
    void SetResult (String res);
    String GetResult ();
    String MakeDeshif ();
}

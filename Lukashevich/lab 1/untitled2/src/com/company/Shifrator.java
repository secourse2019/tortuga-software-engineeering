package com.company;

public interface Shifrator<KeyType> {

   void SetText (String text);
   void SetKey (KeyType key);
   void SetResult (String res);
   String GetResult ();
   String MadeShif ();

}


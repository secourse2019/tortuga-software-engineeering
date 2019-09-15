package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = args[0];
        String key = args[1];

        System.out.println(s1);
        System.out.println(key);

        String SqardShifString =  SqardShif.MadeShif (s1, key);

        System.out.println(SqardShifString);


        SqardShifString = SqardDecoder.DecodSqardShit(SqardShifString, key);

        System.out.println(SqardShifString);


        System.out.println();


        int [][] magicBox = { { 7  ,12 ,1  ,14 },
                              { 2  ,13 ,8  ,11 },
                              { 16 ,3  ,10 ,5  },
                              { 9  ,6  ,15 ,4  }
        };


        String b = MagicBox.Shif(s1, magicBox);
        System.out.println(b);

        b = MagicBox.Deshif(b, magicBox);
        System.out.println(b);

     }



}

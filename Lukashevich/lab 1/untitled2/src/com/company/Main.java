package com.company;

import com.company.lab1.MagicBoxDeshif;
import com.company.lab1.MagicBoxShifr;
import com.company.lab1.SqardDecoder;
import com.company.lab1.SqardShif;
import com.company.lab2.CaesarDesh;
import com.company.lab2.CaesarShif;

public class Main {

    public static void main(String[] args) {
        String s1 = args[0];
        String key = args[1];

        System.out.println(s1);
        System.out.println(key);


        SqardShif shif = new SqardShif(s1, key);
        String SqardShifString =  shif.GetResult();
        System.out.println(SqardShifString);

        SqardDecoder deshif = new  SqardDecoder(SqardShifString, key);
        SqardShifString = deshif.GetResult();
        System.out.println(SqardShifString);


        System.out.println();


        Integer [][] magicBox = { { 7  ,12 ,1  ,14 },
                              { 2  ,13 ,8  ,11 },
                              { 16 ,3  ,10 ,5  },
                              { 9  ,6  ,15 ,4  }
        };


        MagicBoxShifr mbShif = new MagicBoxShifr(s1, magicBox);
        String b = mbShif.GetResult();
        System.out.println(b);

        MagicBoxDeshif mbDesh = new MagicBoxDeshif(b, magicBox);
        b = mbDesh.GetResult();
        System.out.println(b);


        System.out.println();


        CaesarShif caesarShif = new CaesarShif(s1, 12);
        String c = caesarShif.GetResult();
        System.out.println(c);

        CaesarDesh caesarDesh = new CaesarDesh(c, 12);
        c = caesarDesh.GetResult();
        System.out.println(c);


    }



}

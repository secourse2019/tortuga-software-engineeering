package com.company;

public class Main {

    public static void main(String[] args) {

        DoubleArray array = new DoubleArray(6, 10, "УСПЕХ – ЭТО КОГДА ТЫ ДЕВЯТЬ РАЗ УПАЛ, НО ДЕСЯТЬ РАЗ ПОДНЯЛСЯ");
        array.printMatrix();
        System.out.println(array.convert());
        System.out.println(array.deconverter(6, 7,"БМ_Д_АДЫНЭНУТРТЫТОМЬУЬМО,Н_Г_|_|_|_И–ОУ–ОАЧ_Е"));

        DoubleArray array2 = new DoubleArray(4, 4, "здвыаофыоаждылважд");
        System.out.println(array2.convertByKey("даун"));

        DoubleArray array3 = new DoubleArray(4, 6, "системный пароль изменен");

        System.out.println(array3.convertByKey("сканер"));

        MagicSquare matrix = new MagicSquare(); //enter any numbers

//        System.out.println(args[0]);

//        array3.deconvertByKey("сканер", 5);

//        int a = 8;
//        int b = 8;
//
//        int [] arrOfInt = new int[5];
//        char[] arrOfChar = {'h', 'e', 'l', 'l', 'o'};
//
//        for (int i = 0; i < 5; i++) {
//            arrOfInt[i] = (int) arrOfChar[i];
//        }
//
//        System.out.println((int) 'x');


    }
}

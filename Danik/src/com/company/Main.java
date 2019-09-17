package com.company;

public class Main {

    public static void main(String[] args) {
        DoubleArray array = new DoubleArray(6, 10, "УСПЕХ – ЭТО КОГДА ТЫ ДЕВЯТЬ РАЗ УПАЛ, НО ДЕСЯТЬ РАЗ ПОДНЯЛСЯ");
        array.printMatrix();
        System.out.println(array.convert());
        System.out.println(array.deconverter(6, 7,"БМ_Д_АДЫНЭНУТРТЫТОМЬУЬМО,Н_Г_|_|_|_И–ОУ–ОАЧ_Е"));

        DoubleArray array2 = new DoubleArray(4, 4, "здвыаофыоаждылважд");
        System.out.println(array2.convertKey("даун"));

        DoubleArray array3 = new DoubleArray(4, 6, "системный пароль изменен");

        System.out.println(array3.convertKey("сканер"));
        MagicSquare A = new MagicSquare();
    }
}

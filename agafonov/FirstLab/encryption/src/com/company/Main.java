package com.company;

public class Main {

    public static void main(String[] args) {

        //DONE
       /* String text = "ТЕРМИНАТОРПРИБЫВАЕТСЕДЬМОГОВПОЛНОЧЬ";
        String key = "РОВ";
        SympleRear test = new SympleRear(text,5,7);
        test.get();
        SympleDecoder te = new SympleDecoder("ТНПВЕГЛЕАРАДОНРТИЕЬВОМОБТМПЧИРЫСООЬ",5,7);*/


        int[] matrix = new int[]{16,3,2,13,5,10,11,8,9,6,7,12,4,15,14,1};
        MagicQuadrateEncoder test1 = new MagicQuadrateEncoder("ПРИЛЕТАЮВОСЬМОГО", matrix);
        System.out.println(test1.GetBox());
        MagicQuadrateDecoder _test1 = new MagicQuadrateDecoder("ОИРМЕОСЮВТАЬЛГОП", matrix);
        System.out.println(_test1.GetBox());

    }
}

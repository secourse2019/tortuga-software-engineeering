package com.company;

public class Main {

    public static void main(String[] args) {

        //TABLEPER
        //DONE
        String text = "ТЕРМИНАТОРПРИБЫВАЕТСЕДЬМОГОВПОЛНОЧЬ";
        SympleRear test = new SympleRear(text,5,7);
        test.get();
        SympleDecoder te = new SympleDecoder("ТНПВЕГЛЕАРАДОНРТИЕЬВОМОБТМПЧИРЫСООЬ",5,7);

        //MAGICBOX
        //1 символ уходит в никуда
        int[] matrix = new int[]{7,12,1,14,2,13,8,11,16,3,10,5,9,6,15,4};
        MagicQuadrateEncoder test1 = new MagicQuadrateEncoder("ПРИЛЕТАЮВОСЬМОГО", matrix);
        System.out.println(test1.GetBox());
        MagicQuadrateDecoder _test1 = new MagicQuadrateDecoder("ЮЯВОЫТ_СОЛЕТДАГЕ", matrix);
        System.out.println(_test1.GetBox());

/*        PerKeyEncoderr test12 = new PerKeyEncoderr("ТЕРМИНАТОРПРИБЫВАЕТСЕДЬМОГОВПОЛНОЧЬ","РОВ");
        test12.get();
        PerKeyDecoder test12dec = new PerKeyDecoder("ОИТГБЕОЫРВВМПАИОЕНЛТАНСТОЕОЧДРЬЬП МР", "РОВ");
        test12dec.get();*/

        KeyApproach task3 = new KeyApproach("МЫ ДОЛЖНЫ ПРИЗНАТЬ ОЧЕВИДНОЕ: ПОНИМАЮТ ЛИШЬ ТЕ, КТО ХОЧЕТ ПОНЯТЬ ", "МЫСЛЕННО", 8, 8);
        KeyApproach task3Decoder = new KeyApproach("ЬЕСОУЬ,ГТСХК_ОАТООУ_НАД_ВДОЁЯПЫОВТЩР,СИСИО_ТШЯЙЖНОЬ__ИЕЙ_ТДТ_Н-ОЕЬОО_ЛН_", "РАБОТА", 12, 6);
        task3Decoder.decoder();
    }
}

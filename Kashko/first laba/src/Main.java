public class Main {

    public static void main(String[] args) {
        String text = "УСПЕХ – ЭТО КОГДА ТЫ ДЕВЯТЬ РАЗ УПАЛ, НО ДЕСЯТЬ РАЗ ПОДНЯЛСЯ";
        String text1 = "БМ_Д_АДЫНЭНУТРТЫТОМЬУЬМО,Н_Г____И–ОУ–ОАЧ_Е";
        String text2 = "МЫ ДОЛЖНЫ ПРИЗНАТЬ ОЧЕВИДНОЕ: ПОНИМАЮТ ЛИШЬ ТЕ, КТО ХОЧЕТ ПОНЯТЬ";
        String key = "МЫСЛЕННО";
        String text3 = "ОЕОЕНЫТНБТЕЛОНЛ__ОРОЕТС_ОГМАУБЙОЫКЩЫ__,ОЕ_НД_ЙСБЕАВ_ТЕ_Р_ПВСБАКРУЦ";
        String key1 = "СОНАТА";
        String text4 = "ВРЕМЕНА МЕНЯЮТСЯ";
        int[] magicArr = {7,12,1,14,2,13,8,11,16,3,10,5,9,6,15,4};
        String text5 = "ЮЯВОЫТ_СОЛЕТДАГЕ";
        int[] magicArr1 = {7,12,1,14,2,13,8,11,16,3,10,5,9,6,15,4};

        System.out.println(
                SimpleEncryptionMethod.
                        GetEncryptedString(
                                6, 10, args[0]));

        System.out.println(
                SimpleEncryptionMethod.
                        GetDecryptString(
                                6, 7, args[1]));

        System.out.println(
                EncryptionMethodWithWord.
                        GetEncryptStringWithWord(
                                8,8, args[2], args[3]));

        System.out.println(
                EncryptionMethodWithWord.
                        GetDecryptStringWithWord(
                                11, 6, args[4], args[5]));

        System.out.println(
                MagicSquare.GetEncrytStr(magicArr, args[6])
        );

        System.out.println(
                MagicSquare.GetDecryptStr(magicArr1, args[7])
        );

    }

}

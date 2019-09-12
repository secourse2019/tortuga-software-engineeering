package com.company;

    public class Main {
        public static void main(String[] args) {
            String text1 = args[0];
            String text2 = args[1];
            String text3 = args[2];
            String text4 = args[3];
            String text5 = args[4];
            int[][] Matrix1 = {{7, 12, 1, 14}, {2, 13, 8, 11}, {16, 3, 10, 5}, {9, 6, 15, 4}};
            int[][] Matrix2 = {{9, 16, 2, 7}, {6, 3, 13, 12}, {15, 10, 8, 1}, {4, 5, 11, 14}};
            int[][] Matrix3 = {{7, 12, 1, 14}, {2, 13, 8, 11}, {16, 3, 10, 5}, {9, 6, 15, 4}};
            int[][] Matrix4 = {{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}};
            int[][] Matrix5 = {{13, 8, 12, 1}, {2, 11, 7, 14}, {3, 10, 6, 15}, {16, 5, 9, 4}};
            Encoder a1 = new Encoder(text1, Matrix1);
            Encoder a2 = new Encoder(text2, Matrix2);
            Encoder a3 = new Encoder(text3, Matrix3);
            Encoder a4 = new Encoder(text4, Matrix4);
            Encoder a5 = new Encoder(text5, Matrix5);
            a1.encode_();
            a2.encode_();
            a3.encode_();
            a4.decode_();
            a5.decode_();
            a1.print();
            a2.print();
            a3.print();
            a4.print();
            a5.print();
            String t = "УСПЕХ – ЭТО КОГДА ТЫ ДЕВЯТЬ РАЗ УПАЛ, НО ДЕСЯТЬ РАЗ ПОДНЯЛСЯ";
            Cipher b = new Cipher(t, 6, 10);
            b.encode();
            b.print();
            String t1 = " МЫ ДОЛЖНЫ ПРИЗНАТЬ ОЧЕВИДНОЕ: ПОНИМАЮТ ЛИШЬ ТЕ, КТО ХОЧЕТ ПОНЯТЬ";
            Cipher b1 = new Cipher(t1, "МЫСЛЕННО");
            System.out.println(b1.encode_Key());
            String t2 = "КОГДА МЫ СТОИМ, ТО СТОИМЛИ МЫ, ИЛИ ЛИШЬ ПРОПУСКАЕМ СОБСТВЕННЫЕ ШАГИ, КОТОРЫЕ ОТМЕРЯЮТ И СОКРАЩАЮТ НАШ ПУТЬ";
            Cipher b2 = new Cipher(t2, "СЕССИЯ");
            System.out.println(b2.encode_Key());
            String t3 = "ЕСЛИ ДУМАЕШЬ ДОЛГО И ДОБРОСОВЕСТНО, ТО В КОНЦЕ КОНЦОВ ВСЕГДА ПОЙМЕШЬ. ПРОСТО МАЛО КТО ХОРОШО ДУМАЕТ.";
            Cipher b3 = new Cipher(t3, 6, 10);
            b3.encode();
            b3.print();
            String t4 = "СМЫСЛ ЖИЗНИ НАШЕЙ – НЕПРЕРЫВНОЕ ДВИЖЕНИЕ";
            Cipher b4 = new Cipher(t4, "ВЕСНА");
            System.out.println(b4.encode_Key());
            String t5 = " МУЗЫКА ОБЛАДАЕТ МАГИЧЕСКОЙ СИЛОЙ – ВДРУГ СОБИРАЕТ РАССЕЯННЫЕ МЫСЛИ И ДАЕТ ПОКОЙ ВСТРЕВОЖЕННОЙ ДУШЕ.";
            Cipher b5 = new Cipher(t5, "ВЕДОМОСТЬ");
            System.out.println(b5.encode_Key());
            String t6 = "РАЗУМА ЛИШАЕТ НЕ СОМНЕНИЕ, А УВЕРЕННОСТЬ";
            Cipher b6 = new Cipher(t6, "МЫСЛЕННО");
            System.out.println(b6.encode_Key());
            String t7 = "НИКТО НИЧЕГО НЕ МОЖЕТ СКАЗАТЬ ПРО ВАС. ЧТО БЫ ЛЮДИ НИ ГОВОРИЛИ, ОНИ ГОВОРЯТ ПРО САМИХ СЕБЯ";
            Cipher b7 = new Cipher(t7, "713254986");
            System.out.println(b7.encode_Key());
        }
    }
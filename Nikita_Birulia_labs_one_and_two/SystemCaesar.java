package com.company;

public class SystemCaesar {
    private char[] cipher;
    private char[] instance;

    SystemCaesar(String message, int value) {
        cipher = new char[message.length()];
        instance = new char[message.length()];
        fillCipher(message);
        fillInstance();
        ChangeInstanse(value);
        insertElements();
    }

    private void fillCipher(String message) {
        for(int i = 0; i != message.length(); ++i) {
            cipher[i] = (char)((int)message.charAt(i));
        }
    }

    private void fillInstance() {
        for(int i = 0; i != cipher.length; ++i) {
            if(cipher[i] >= 1040 && cipher[i] <= 1071) {
                instance[i] = cipher[i];
            } else {
                instance[i] = ' ';
            }

        }
    }

    private void ChangeInstanse(int value) {
        for(int i = 0; i != instance.length; ++i) {
            if(instance[i] != ' ') {
                instance[i] = (char)((int)rolling(value, i));

            }
        }
    }

    private int rolling(int value, int index) {
        int number = ((int)instance[index] + value);
        while(number < 1040) {
            number = 1072 - (1040 - number);
        }
        while(number > 1071) {
            number = number - 1072 + 1040;
        }
        return  number;
    }

    private void insertElements() {
        for(int i = 0; i != instance.length; ++i) {
            if(instance[i] == ' ') {
                instance[i] = cipher[i];
            }
        }
    }



    public String get() {
        String result = new String(instance);
        return result;
    }

}

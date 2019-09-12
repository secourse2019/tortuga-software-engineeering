package com.company;

public class SystemTrismusEncoder {
    private char[] box;
    private char[][] matrixBox;
    private char[] cipher;
    private char[] instance;

    SystemTrismusEncoder(String message, String key) {
        box = new char[32];
        matrixBox = new char[4][8];
        includeLetters(key);
        cipher = new char[message.length()];
        instance = new char[message.length()];
        fillCipher(message);
        fillInstance();
        ChangeInstanse();
    }

    private void includeLetters(String key) {
        int j = 0;
        for(int i = 0; i != key.length(); ++i) {
            if(isInUnity(j, key.charAt(i))) {
                box[j++] = key.charAt(i);
            }
        }
        includeSecondPart(j);
    }

    private void includeSecondPart(int index) {
        for(int i = index,  number  = 1040; i != box.length; ++number) {
            if(isInUnity(i, (char)number) && number != 1098) {
                box[i++] = (char)number;
            }
        }
        toMatrixBox();
    }

    private void toMatrixBox() {
        for(int i = 0, temp = 0; i != 4; ++i) {
            for(int j = 0; j != 8; ++j, ++temp) {
                matrixBox[i][j] = box[temp];
            }
        }
    }

    private boolean isInUnity(int ind, char value) {
        for(int i = 0; i < ind; ++i) {
            if(box[i] == value) {
                return false;
            }
        }
        return true;
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

    private void ChangeInstanse() {
        for(int i = 0, temp = 0; i != 4; ++i) {
            for(int j = 0; j != 8; ++j) {
                if(instance[temp] == ' ') {
                    temp++;
                    i = 0;
                    j = -1;
                } else if((instance[temp] == matrixBox[i][j] || instance[temp] == ' ') && temp < instance.length - 1) {
                    if(i == 3) {
                        instance[temp] = matrixBox[0][j];
                    } else {
                        instance[temp] = matrixBox[i + 1][j];
                    }
                    i = 0;
                    j = -1;
                    temp++;
                }

            }
        }
        insertElements();
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

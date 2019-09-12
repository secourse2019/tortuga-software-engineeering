package com.company;

class Encoder {
    public int row;
    public int col;
    public String text;
    public int[][] Cube;
    private char[] charCube;

    public Encoder(String text, int[][] Cube_) {
        row = col = Cube_.length;
        this.text = text;
        Cube = new int[row][col];
        charCube = new char[row * col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                Cube[i][j] = Cube_[i][j];
            }
        }
    }

    public void encode_() {
        for (int i = 0, s = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j, ++s) {
                charCube[s] = text.charAt(Cube[i][j] - 1);
            }
        }
    }

    public void decode_() {
        for (int i = 0, t = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j, ++t) {
                charCube[Cube[i][j]-1] = text.charAt(t);
            }
        }
        }
    public void print() {
        for (int i = 0; i < row * col; ++i) {
            System.out.print(charCube[i]);
        }
        System.out.println();
    }
}

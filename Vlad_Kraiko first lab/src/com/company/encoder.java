package com.company;

class Encoder {
    public int row;
    public int col;
    public String text;
    public int[][] Cube;

    Encoder(String text_, int[][] Cube_) {
        row = col = Cube_.length;
        text = text_;
        Cube = new int[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                Cube[i][j] = Cube_[i][j];
            }
        }
    }

    public void Encode_() {
        for (int t = 0; t < row; ++t) {
            for (int k = 0; k < col; ++k) {
                System.out.print(text.charAt(Cube[t][k] - 1));

            }
        }
        System.out.println();
    }

    public void Decode_() {
        char[] temp = new char[row * row];
            for (int i = 0, t = 0; i < row; ++i) {
                for (int j = 0; j < col; ++j, ++t) {
                    temp[Cube[i][j]-1] = text.charAt(t);
                }
            }
            for (char lul : temp) {
                System.out.print(lul);
            }
            System.out.println();
        }

    }

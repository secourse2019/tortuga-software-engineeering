package com.company;

import java.util.Scanner;

public class MagicSquare {

    private byte[][] square;
    private byte magicNumber;
    private long tmp = 0;

    public MagicSquare() {

        Scanner sc = new Scanner(System.in);
        byte size = sc.nextByte();
        square = new byte[size][size];
        sc.close();
        magicNumber = (byte) ((size * size * size + size) / 2);

        long start = System.currentTimeMillis();
        solve(0, 0);
        printSquare();
        long duration = System.currentTimeMillis() - start;
        System.out.println(tmp);
        System.out.println(duration);
    }

    private boolean solve(int x, int y) {
        tmp++;
        if (x == square.length && y == square.length - 1 && isMagic()) {
            return true;
        }

        if (x == square.length) {
            y++;
            x = 0;
        }

        for (byte i = 1; i <= square.length * square.length; i++) {

            if (containsNumber(i) == false) {

                if (isValidRow(x) && isValidCol(y)) {

                    square[x][y] = i;

                    if (solve(x + 1, y) == true) {
                        return true;
                    }
                }

            }
        }

        if (x < square.length && y < square.length) {
            square[x][y] = 0;
        }

        return false;
    }

    private boolean isMagic() {

        int diagonal1 = 0;
        int diagonal2 = 0;
        int col = 0;
        int row = 0;

        for (int i = 0; i < square.length; i++) {

            for (int j = 0; j < square[0].length; j++) {

                col = col + square[j][i];
                row = row + square[i][j];

                if (i == 0) {
                    diagonal1 = diagonal1 + square[j][j];
                    diagonal2 = diagonal2 + square[j][square.length - j - 1];
                }

            }

            if (col != magicNumber || row != magicNumber || diagonal1 != magicNumber || diagonal2 != magicNumber) {
                return false;
            }

            row = 0;
            col = 0;
        }

        return true;
    }

    private boolean isValidRow(int row) {

        int sum = 0;

        for (byte i = 0; i < square.length; i++) {
            sum = sum + square[row][i];
        }

        if (sum <= magicNumber)
            return true;

        return false;
    }

    private boolean isValidCol(int col) {

        int sum = 0;

        for (byte i = 0; i < square.length; i++) {
            sum = sum + square[i][col];
        }

        if (sum <= magicNumber)
            return true;

        return false;
    }

    public boolean containsNumber(byte value) {

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[0].length; j++) {

                if (square[i][j] == value) {
                    return true;
                }

            }
        }
        return false;
    }

    private void printSquare() {

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[0].length; j++) {

                System.out.print(square[i][j] + " ");

            }
            System.out.println();
        }
    }
}

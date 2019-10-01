package com.company.util;

public class FillArrayByRow implements IFillArray {

    @Override
    public void call(char[][] array, int i, int j, char content) {
        array[i][j] = content;
    }
}

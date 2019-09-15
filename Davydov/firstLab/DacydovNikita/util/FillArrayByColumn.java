package com.company.util;

public class FillArrayByColumn implements IFillArray {

    @Override
    public void call(char[][] array, int i, int j, char content) {
        array[j][i] = content;
    }
}

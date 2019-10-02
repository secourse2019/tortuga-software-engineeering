package com.company.Transport.util;


import java.util.AbstractList;

public class Util {
    private Util(){}
    public static void move(AbstractList first, AbstractList second, int index) {
        first.add(second.get(index));
        second.remove(index);
    }
}

package com.company.Transport.util;

import java.util.ArrayList;

public class Util {
    private Util(){}
    public static void Move(ArrayList first, ArrayList second, int index) {
        first.add(second.get(index));
        second.remove(index);
    }
}

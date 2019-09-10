package com.company;


import com.sun.source.doctree.TextTree;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        KeyAppproachReverse res = new KeyAppproachReverse(args[0], args[1], 13, 5);
        res.printArray();
    }
}

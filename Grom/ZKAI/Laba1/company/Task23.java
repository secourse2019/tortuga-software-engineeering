package com.company;

import java.util.Scanner;

class Task_23 {
    public double Task_23 (int n , int x){
        int x1 = x;
        int res = x;
        for (int i = 1; i != n; ++i){
        x1 *= Math.pow(-1,x);
        res +=x1;
        }
        return res;
    }
}

public class Task23{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int x = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d", n, x));
        Task_23 b = new Task_23();
        System.out.println(b.Task_23(5,7));
    }
}
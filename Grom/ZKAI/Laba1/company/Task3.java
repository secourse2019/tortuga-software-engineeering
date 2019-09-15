package com.company;

import java.util.Scanner;

class Task_3 {
    public double Task_3(int a , int b) {
        int res = 1;
        for (int i = 5; i > 1; --i) {
            res = b - a - 1;
        }
        return res;
    }
}

public class Task3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("get a: ");
        int a = in.nextInt();
        System.out.println("get b: ");
        int b = in.nextInt();
        System.out.println(String.format("%d %d", a, b));
        Task_3 c = new Task_3();
        System.out.println(c.Task_3(3,6));
    }
}


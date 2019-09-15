package com.company;

import java.util.Scanner;

class Task_4 {
    public double Task_4(int c, int i) {
        int res = 1;
        for (i = 1; i < 10; i++) {
            res = c * i;
        }
        return res;
    }

}
public class Task4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("get a: ");
        int c = in.nextInt();
        System.out.println("get b: ");
        int i = in.nextInt();
        System.out.println(String.format("%d %d", c, i ));
        Task_4 b = new Task_4();
        System.out.println(b.Task_4(3,10));
    }
}

package com.company;

class Task_12 {
    public double task_12(int n) {
        double r = 1.1;
        double mul_num = 1.2;
        for(int i = 1; i != n; ++i, mul_num += 0.1 ){
            r *= mul_num;
        }
        return r;
    }
}

public class Task12 {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",n));
        Task_12 b = new Task_12();
        System.out.println(b.task_12(3));

    }
}

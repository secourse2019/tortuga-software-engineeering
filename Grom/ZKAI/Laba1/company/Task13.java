package com.company;

class Task_13 {
    public double task_13(int n) {
        double res = 1;
        for(int i = 0,q = 1; i != n; ++i, q += 0.1){
            res += -q;
        }
        return res;
    }
}

public class Task13 {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",n));
        Task_13 b = new Task_13();
        System.out.println(b.task_13(5));

    }
}
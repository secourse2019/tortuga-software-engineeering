package com.company;

class Task_13 {
    public double task_13(double n) {
        double r = 1;
        for(double i = 0,q = 1; i != n; ++i, q += 0.1){
            r += -q;
        }
        return r;
    }
}

public class Task13 {
    public static void main(String[] args) {

        Task_13 b = new Task_13();
        System.out.println(b.task_13(3));

    }
}
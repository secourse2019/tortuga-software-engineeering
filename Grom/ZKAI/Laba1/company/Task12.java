package com.company;

class Task_12 {
    public double task_12(double n) {
        double r = 1;
        for(int i = 1; i != n; ++i){
            r *= 1 + 0.1 * i;
        }
        return r;
    }
}

public class Task12 {
    public static void main(String[] args) {

        Task_12 b = new Task_12();
        System.out.println(b.task_12(3));

    }
}

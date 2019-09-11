package com.company;

class Task_21 {
    public double Task_21 (int n){
        int r = 1;
        int n1 = 1;
        for(int i = 1; i != n; ++i){
            n1 *= i;
            r += 1/n1;
        }
        return r;
    }
}

public class Task21{
    public static void main(String[] args) {

        Task_21 b = new Task_21();
        System.out.println(b.Task_21(2));
    }
}
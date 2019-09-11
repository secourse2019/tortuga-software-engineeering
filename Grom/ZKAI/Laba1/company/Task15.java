package com.company;

class Task_15 {
    public double Task15 (int r){
        int n = 2;
        int a = 3;
        for(int i = 0; i != n; ++i){
            r *= a;
        }
        return r;
    }
}


public class Task15{
    public static void main(String[] args) {

        Task_15 b = new Task_15();
        System.out.println(b.Task15(2));
    }
}
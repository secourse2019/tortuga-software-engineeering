package com.company;

class Task_20 {
    public double Task_20 (int n){
        int r = 0;
        int n1 = 1;
        for(int i = 1; i != n; ++i){
            n1 *= i;
            r += n;
        }
        return r;
    }
}

public class Task20{
    public static void main(String[] args) {

        Task_20 b = new Task_20();
        System.out.println(b.Task_20(4));
    }
}

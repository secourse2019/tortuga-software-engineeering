package com.company;

class Task_22 {
    public double Task_22 (int n , int x){
        int x1 = 1;
        int n1 = 1;
        double r = 1.0;
        for (int i = 1; i<n ;++i){
        n1 *= i;
        x1 *= x;
        r += x1/n1;
        }
        return r;
    }
}

public class Task22{
    public static void main(String[] args) {

        Task_22 b = new Task_22();
        System.out.println(b.Task_22(2,10));
    }
}
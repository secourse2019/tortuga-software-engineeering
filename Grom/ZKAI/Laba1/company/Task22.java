package com.company;

class Task_22 {
    public double Task_22 (int n , int x){
        int x1 = 1;
        int n1 = 1;
        double res = 1.0;
        for (int i = 1; i<n ;++i){
        n1 *= i;
        x1 *= x;
        res += x1/n1;
        }
        return res;
    }
}

public class Task22{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int x = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d",n,x));
        Task_22 b = new Task_22();
        System.out.println(b.Task_22(2,10));
    }
}
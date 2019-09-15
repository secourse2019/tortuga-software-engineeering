package com.company;

 class Task_26 {
    public double Task_26 (int x , int n){
        int x1 = x;
        int r = x;
        int k = 1;
        for (int i = 2; i != n; ++i){
            k+=2;
            x1 *= -1*x*x;
            r += x1/k;
        }
        return r;
    }
 }

public class Task26{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int x = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d",n,x));
        Task_26 b = new Task_26();
        System.out.println(b.Task_26(3,6));
    }
}

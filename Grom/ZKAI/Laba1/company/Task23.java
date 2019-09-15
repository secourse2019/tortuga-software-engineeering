package com.company;

 class Task_23 {
    public double Task_23 (int n , int x){
        int x1 = x;
        int r = x;
        for (int i = 1; i != n; ++i){
        x1 *= Math.pow(-1,x);
        r +=x1;
        }
        return r;
    }
}

public class Task23{
    public static void main(String[] args) {

        Task_23 b = new Task_23();
        System.out.println(b.Task_23(1,10));
    }
}
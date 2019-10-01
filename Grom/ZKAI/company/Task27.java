package com.company;

class Task_27 {
    public double Task_27 (int n){
        int f1=1,f2=1,f=0,k=2;
        while (f<n){
            ++k;
            f=f2+f1;
            f2=f1;
            f1=f;
        }
        return k;
    }
}

public class Task27{
    public static void main(String args []){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_27 c = new Task_27();
        System.out.println(c.Task_27(610));
    }
}
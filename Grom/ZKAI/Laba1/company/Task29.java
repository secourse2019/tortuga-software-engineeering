package com.company;

class Task_29 {
    public double Task_29(int n, int a, int b){
    int h = (a-b)/n;
    int res = 1;
    for(int i = 1; i != n; ++i){
        res = a+i*h;
    }
    return res;
    }
}

public class Task29{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int a = Integer.valueOf(args[1]);
        int b = Integer.valueOf(args[2]);
        System.out.println(String.format("%d %d %d",n,a,b));
        Task_29 c = new Task_29();
        System.out.println(c.Task_29(3,10 ,4));
    }
}
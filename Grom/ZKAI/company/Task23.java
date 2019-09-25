package com.company;

class Task_23 {
    public double Task_23 (int a, int b){
        while ((a!=0)&(b!=0)){
            if (a>b) a=a%b;
            else b=b%a;
        }
        return a+b;
    }
}

public class Task23{
    public static void main(String args []){
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d", a,b));
        Task_23 c = new Task_23();
        System.out.println(c.Task_23(70,20));
    }
}


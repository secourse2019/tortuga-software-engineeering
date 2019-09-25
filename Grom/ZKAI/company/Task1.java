package com.company;

 class Task_1 {
    public double Task_1(int a , int b){
        int temp=a;
        while (temp >= a){
            temp -= b;
        }
        return temp + b;
    }

}

public class Task1 {
    public static void main (String[] args){
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d", a, b));
        Task_1 c = new Task_1();
        System.out.println(c.Task_1(2,3));
    }

}

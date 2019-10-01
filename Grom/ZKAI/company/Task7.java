package com.company;

class Task_7 {
    public double Task_7 (int n){
        int k = 1;
        while (k*k<=n){
            ++k;
        }
        return k;
    }
}

public class Task7{
    public static void main (String[] args){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_7 c = new Task_7();
        System.out.println(c.Task_7(9));
    }
}
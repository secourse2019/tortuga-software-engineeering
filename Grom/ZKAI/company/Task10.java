package com.company;

class Task_10 {
    public double Task_10 (int n) {
        int k=0;
        int temp=3;
        while (temp<n) {
            temp*=3;
            ++k;
        }
        return k;
    }
}

public class Task10{
    public static void main(String args[]){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_10 c = new Task_10();
        System.out.println(c.Task_10(8));

    }
}
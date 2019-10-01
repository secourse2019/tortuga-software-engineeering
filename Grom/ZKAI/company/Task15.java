package com.company;

class Task_15{
    public double Task_15(int p){
        int sum=1000;
        while (sum<=1100) {

            sum+=sum*p/100;
        }
        return sum;
    }
}

public class Task15 {
    public static void main(String args[]) {
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_15 c = new Task_15();
        System.out.println(c.Task_15(10));
    }
}
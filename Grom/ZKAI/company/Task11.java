package com.company;

class Task_11 {
    public double Task_11 (int n){
        int k = 0;
        int sum = 0;
        while (sum <= n){
            ++k;
            sum += k;
        }
        return sum;
    }
}

public class Task11{
    public static void main(String args[]){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_11 c = new Task_11();
        System.out.println(c.Task_11(15));

    }
}
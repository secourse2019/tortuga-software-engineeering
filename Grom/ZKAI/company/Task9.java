package com.company;

class Task_9 {
    public double Task_9 (int n) {
        int k=1;
        int temp=3;
        while (temp<=n) {
            temp*=3;
            ++k;
        }
        return k;
    }
}

public class Task9{
    public static void main(String args[]){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_9 c = new Task_9();
        System.out.println(c.Task_9(10));

    }
}
package com.company;



class Task_11{
    public double task_11 (int n){
        double temp = 0;
        for(int i = 0; i != n; ++i){
            temp += Math.pow(n + i, 2);
        }
        return temp;
    }
}


public class Task11 {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",n));
        Task_11 b = new Task_11();
        System.out.println(b.task_11(10));

    }
}

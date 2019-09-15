package com.company;
class Task_10{
    public double task_10(int n){
        double sum = 0;
        for(double i = 1; i < n; ++i){
            sum += (1 / i);
        }
        return sum;
    }
}

public class Task10 {
    public static void main (String[] args){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",n));
        Task_10 b = new Task_10();
        System.out.println(b.task_10(10));
    }

}

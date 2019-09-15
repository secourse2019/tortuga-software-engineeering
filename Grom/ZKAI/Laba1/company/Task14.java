package com.company;

 class Task_14 {
    public double Task_14(int sum){
        int n = 20;
        for(int i = 1; i != n; ++i){
            sum+=2*i-1;
        }
        return sum;
    }
}

public class Task14{
    public static void main(String[] args) {
        int sum = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",sum));
        Task_14 b = new Task_14();
        System.out.println(b.Task_14(3));
    }
}
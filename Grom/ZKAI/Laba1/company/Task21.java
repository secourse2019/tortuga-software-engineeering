package com.company;

class Task_21 {
    public double Task_21 (int n){
        int res = 1;
        int n1 = 1;
        for(int i = 1; i != n; ++i){
            n1 *= i;
            res += 1/n1;
        }
        return res;
    }
}

public class Task21{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d" , n));
        Task_21 b = new Task_21();
        System.out.println(b.Task_21(2));
    }
}
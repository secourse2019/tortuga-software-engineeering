package com.company;

class Task_15 {
    public double Task15 (int res){
        int n = 2;
        int a = 3;
        for(int i = 0; i != n; ++i){
            res *= a;
        }
        return res;
    }
}


public class Task15{
    public static void main(String[] args) {
        int res = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",res));
        Task_15 b = new Task_15();
        System.out.println(b.Task15(2));
    }
}
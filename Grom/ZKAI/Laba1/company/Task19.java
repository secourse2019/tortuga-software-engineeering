package com.company;

 class Task_19 {
     public double Task_19 (int n){
         int res = 1;
         for(int i = 1; i != n; ++i){
             res *= n;
         }
         return res;
     }
}

public class Task19{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",n));
        Task_19 b = new Task_19();
        System.out.println(b.Task_19(3));
    }
}
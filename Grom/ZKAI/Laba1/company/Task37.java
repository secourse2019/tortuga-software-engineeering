package com.company;

 class Task_37 {
     public double Task_37 (int n){
         int res = 0;
         int ni;
         for(int i = 1; i != n; ++i){
             ni = i;
             for(int i2 =1; i2 != i; ++i2) ni *= i;
             res += ni;
         }
         return res;
     }
}

public class Task37{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",n));
        Task_37 b = new Task_37();
        System.out.println(b.Task_37(4));
    }
}
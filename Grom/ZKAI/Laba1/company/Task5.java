package com.company;

 class Task_5 {
     public double Task_5(int p, int i) {
         int res = 1;
         for (i = 1; i < 10; ++i) {
             res = (int) (0.1 * p * i);
         }
         return res;
     }
 }

public class Task5{
    public static void main(String[] args) {
        int p = Integer.valueOf(args[0]);
        int i = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d", p, i));
        Task_5 b = new Task_5();
        System.out.println(b.Task_5(3,10));
    }
}
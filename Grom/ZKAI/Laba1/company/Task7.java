package com.company;

 class Task_7 {
     public double Task_7(int a, int b) {
         int sum = 0;
         for (int i = a; i != b; ++i) {
             sum += i;
         }
         return sum;
     }
 }
 public class Task7{
         public static void main(String[] args) {
             int a = Integer.valueOf(args[0]);
             int b = Integer.valueOf(args[1]);
             System.out.println(String.format("%d %d", a,b));
             Task_7 c = new Task_7();
             System.out.println(c.Task_7(3,10));
         }
     }


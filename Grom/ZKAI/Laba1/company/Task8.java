package com.company;

 class Task_8 {
     public double Task_8(int a, int b) {
         int sum = 0;
         for (int i = a; i < b + 1; i++) {
             sum += i;
         }
         return sum;
     }

 }
public class Task8{
    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d",a,b));
        Task_8 c = new Task_8();
        System.out.println(c.Task_8(7,20));
    }
}



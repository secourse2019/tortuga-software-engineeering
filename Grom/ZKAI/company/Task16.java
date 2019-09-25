package com.company;

 class Task_16 {
    public double Task_16 (int p ) {
        int sum = 10;
        int day = 10;
        while (sum <= 200) {
            day += day * p / 100;
            sum += day;
        }
        return sum;
    }
 }

 public class Task16{
     public static void main(String args []){
         int p = Integer.valueOf(args[0]);
         System.out.println(String.format("%d", p));
         Task_16 c = new Task_16();
         System.out.println(c.Task_16(20));
     }
 }


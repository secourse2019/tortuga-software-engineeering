package com.company;

 class Task_8 {
     public double Task_8(int n){
         int k = 1;
         while (k*k <=n ){
             ++k;
         }
         return k-1;
     }
}

public class Task8{
     public static void main(String args[]){
         int n = Integer.valueOf(args[0]);
         System.out.println(String.format("%d", n));
         Task_8 c = new Task_8();
         System.out.println(c.Task_8(16));

     }
}
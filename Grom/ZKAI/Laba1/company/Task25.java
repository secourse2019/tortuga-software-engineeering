package com.company;

 class Task_25 {
     public double Task_25(int x, int n){
         int x1 = x;
         int r = x;
         for (int i = 2; i != n; ++i){
             x1 *= -1 *x;
             r += x1/i;
             x1 = x1 * -1;
         }
         return r;
     }
}

public class Task25{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int x = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d",n,x));
        Task_25 b = new Task_25();
        System.out.println(b.Task_25(3,6));
    }
}
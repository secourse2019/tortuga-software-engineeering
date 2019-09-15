package com.company;

 class Task_31 {
     public double Task_31 (int n , int c){
         double a = 2;
         for (int i = 1; i != n; ++i){
             a = 2+1/a;
         }
         return a;
     }

}

public class Task31{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int c = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d",n,c));
        Task_31 b = new Task_31();
        System.out.println(b.Task_31(4,5));
    }
}
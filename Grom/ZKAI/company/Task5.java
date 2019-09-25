package com.company;

 class Task_5 {
     public double Task_5 (int n){
         int k=0;
         while (n>=2){
             ++k;
             n/=2;
         }
         return k;
     }
}

public class Task5 {
    public static void main (String[] args){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_5 c = new Task_5();
        System.out.println(c.Task_5(8));
    }

}

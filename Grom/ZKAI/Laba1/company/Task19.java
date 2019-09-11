package com.company;

 class Task_19 {
     public double Task_19 (int n){
         int r = 1;
         for(int i = 1; i != n; ++i){
             r *= n;
         }
         return r;
     }
}

public class Task19{
    public static void main(String[] args) {

        Task_19 b = new Task_19();
        System.out.println(b.Task_19(3));
    }
}
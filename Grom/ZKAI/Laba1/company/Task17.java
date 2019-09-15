package com.company;

class Task_17 {
   public double Task_17 (int r){
       int a = 2;
       int n = 10;
       int a2 = 2;
       for(int i = 2; i != n; ++i){
           a2 *= a;
           r += a2;
       }
       return r;
    }
}

public class Task17{
    public static void main(String[] args) {

        Task_17 b = new Task_17();
        System.out.println(b.Task_17(2));
    }
}

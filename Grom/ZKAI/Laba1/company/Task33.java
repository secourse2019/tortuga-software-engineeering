package com.company;

 class Task_33 {
    public double Task_33 (int k){
        int f1 = 1;
        int f2 = 1;
        for (int i = 3; i != k; ++i){
            f1 = f1+f2;
            f2 = f1 - f2;
        }
        return f1;
    }

 }

public class Task33{
    public static void main(String[] args) {
        int k = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",k));
        Task_33 c = new Task_33();
        System.out.println(c.Task_33(6));
    }
}

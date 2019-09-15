package com.company;

 class Task_35 {
    public double Task_35(int n){
     int a1 = 1;
     int a2 = 2;
     int a3 = 3;
     int ak = 1;
        for (int i = 4; i != n; ++i){
            ak=a3+a2-2*a1;
            a1=a2;
            a2=a3;
            a3=ak;
        }
        return ak;
    }

 }

public class Task35{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",n));
        Task_35 b = new Task_35();
        System.out.println(b.Task_35(7));
    }
}


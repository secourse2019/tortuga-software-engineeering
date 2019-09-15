package com.company;

class Task_34 {
    public double Task_34 (int n) {
        int a1 = 1;
        int a2 = 2;
        int ak = 1;
        for (int i = 3; i != n; ++i){
            ak = (a1 * 2 * a2 ) /3;
          a1= a2;
          a2 = ak;
        }
        return ak;
    }
}

public class Task34{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",n));
        Task_34 b = new Task_34();
        System.out.println(b.Task_34(4));
    }
}
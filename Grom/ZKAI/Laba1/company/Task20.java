package com.company;

class Task_20 {
    public double Task_20 (int n){
        int res = 0;
        int n1 = 1;
        for(int i = 1; i != n; ++i){
            n1 *= i;
            res += n;
        }
        return res;
    }
}

public class Task20{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",n));
        Task_20 b = new Task_20();
        System.out.println(b.Task_20(4));
    }
}

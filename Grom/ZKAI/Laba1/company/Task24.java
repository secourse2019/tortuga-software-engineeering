package com.company;

 class Task_24 {
    public double Task_24 (int x, int n){
        int x1 = 1;
        int f = 1;
        int sum = 1;
        int z = 1;
        for(int i = 2; i != 2*n ; ++i){
        f *= i;
        x1 = x * x1;
        z = -z;
        sum +=  z*((Math.pow(x1,2)/f));
        }
        return sum;
    }

 }

public class Task24{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int x = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d",n,x));
        Task_24 b = new Task_24();
        System.out.println(b.Task_24(2,3));
    }
}
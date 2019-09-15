package com.company;

 class Task_27 {
    public double Task_27 (int x , int n){
        double t1 = 1;
        double t2 = 1;
        double p = x;
        double r = x;
        for(int i = 2; i != n; ++i){
            t1 *= 2*i-1;
            t2 *=2*i;
            p = Math.pow(x,x);
            r += t1*p/(t2*(2*i+1));
        }
        return r;
    }
 }

public class Task27{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int x = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d",n,x));
        Task_27 b = new Task_27();
        System.out.println(b.Task_27(3,6));
    }
}

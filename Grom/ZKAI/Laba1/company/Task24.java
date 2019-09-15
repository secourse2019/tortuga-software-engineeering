package com.company;

 class Task_24 {
    public double Task_24 (double x, int n){
        double x1 = 1;
        double f = 1;
        int s = 1;
        int z = 1;
        for(int i = 2; i != 2*n ; ++i){
        f *= i;
        x1 = x * x1;
        z = -z;
        s +=  z*((Math.pow(x1,2)/f));
        }
        return s;
    }

 }

public class Task24{
    public static void main(String[] args) {

        Task_24 b = new Task_24();
        System.out.println(b.Task_24(2,3));
    }
}
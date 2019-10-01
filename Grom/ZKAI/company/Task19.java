package com.company;

class Task_19 {
    public double Task_19 (int n){
        int res=0;
        while (n>0) {
            res=res*10+n % 10;
            n /=10;
        }
        return res;
    }
}

public class Task19{
    public static void main(String args []){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_19 c = new Task_19();
        double res = c.Task_19(179);
        System.out.println(res);
    }
}
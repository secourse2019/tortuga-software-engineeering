package com.company;

class Task_6 {
    public double Task_6(int n){
        float res=1;
        while (n>=2){
            res*=n;
            n-=2;
        }
        return res;
    }
}

public class Task6 {
    public static void main (String[] args){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_6 c = new Task_6();
        System.out.println(c.Task_6(7));
    }

}
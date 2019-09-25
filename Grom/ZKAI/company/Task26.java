package com.company;

class Task_26 {
    public double Task_26 (int n){
        int f1=1,f2=1,f=0;

        while (f<n){
            f=f2+f1;
            f2=f1;
            f1=f;
        }
        return f1+f2;
    }
}

public class Task26{
    public static void main(String args []){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_26 c = new Task_26();
        System.out.println(c.Task_26(377));
    }
}

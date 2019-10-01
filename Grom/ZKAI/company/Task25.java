package com.company;

class Task_25 {
    public double Task_25 (int n){
        int f1=1,f2=1,f=0;
        while (f<n+1){
            f=f2+f1;
            f2=f1;
            f1=f;
        }
        return f;
    }
}

public class Task25{
    public static void main(String args []){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_25 c = new Task_25();
        System.out.println(c.Task_25(144));
    }
}


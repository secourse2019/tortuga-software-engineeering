package com.company;

class Task_24 {
    public boolean Task_24 (int n){
        int f1=1,f2=1,f=0;

        while (f<n){
            f=f2+f1;
            f2=f1;
            f1=f;
        }
        if(f==n){
            return true;
        }
        return false;
    }
}

public class Task24{
    public static void main(String args []){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_24 c = new Task_24();
        System.out.println(c.Task_24(89));
    }
}
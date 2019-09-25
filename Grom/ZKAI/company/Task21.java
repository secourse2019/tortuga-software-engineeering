package com.company;

class Task_21 {
    public boolean Task_21 (int n){
        while((n>0)&((n%10)%2==0)) {
            n /=10;
        }
        if((n%10)%2!=0){
            return true;
        }
        return false;
    }
}

public class Task21{
    public static void main(String args []){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_21 c = new Task_21();
        System.out.println(c.Task_21(25));
    }
}
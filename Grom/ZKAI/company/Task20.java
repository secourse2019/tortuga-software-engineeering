package com.company;

class Task_20 {
    public boolean Task_20 (int n){
        while((n>0)&((n%10)!=2)) {
            n /=10;
        }
        if((n >0 &((n%10)==2))){
            return true;
        }
        return false;
    }
}

public class Task20{
    public static void main(String args []){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_20 c = new Task_20();
        System.out.println(c.Task_20(22));
    }
}
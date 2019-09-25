package com.company;

class Task_22 {
    public boolean Task_22 (int n){
        int k = 2;
        while((k<n-1) & ((n%k)!=0) ){
            ++k;
        }
        if((n%k)!=0){
            return true;
        }
        return false;
    }
}

public class Task22{
    public static void main(String args []){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_22 c = new Task_22();
        System.out.println(c.Task_22(70));
    }
}

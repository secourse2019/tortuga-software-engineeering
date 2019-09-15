package com.company;

 class Task_32 {
    public double Task_32 (int n ){
        int ai = 1;
        int res = 1;
        for(int i = 1; i != n; ++i){
            res = (ai+1)/n;
        }
        return res;
    }
 }

public class Task32{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",n));
        Task_32 c = new Task_32();
        System.out.println(c.Task_32(4));
    }
}
package com.company;

class Task_3 {
    public double Task_3(int n , int k){
        int num=0;
        while (n>=k){
            n -=k;
            ++num;
        }
        return num;
    }
}

public class Task3 {
    public static void main (String[] args){
        int n = Integer.valueOf(args[0]);
        int k = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d", n, k));
        Task_3 c = new Task_3();
        System.out.println(c.Task_3(6,4));
    }

}
package com.company;

class Task_4 {
    public boolean Task_4 (int n , int r , int s){
        while (r * n <= n){
            r *= s;
        }
        if (r == n){
            return true;
        }
        return false;
    }
}

public class Task4 {
    public static void main (String[] args){
        int n = Integer.valueOf(args[0]);
        int r = Integer.valueOf(args[1]);
        int s = Integer.valueOf(args[2]);
        System.out.println(String.format("%d %d %d", n, r, s));
        Task_4 c = new Task_4();
        System.out.println(c.Task_4(3,3,9));
    }

}
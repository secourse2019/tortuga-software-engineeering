package com.company;

class Task_16 {
        public double Task16(int res) {
            int a =2;
            int n =10;
            for (int i = 1; i != n; ++i) {
                res *= a;
            }
            return res;
        }
    }


public class Task16{
    public static void main(String[] args) {
        int res = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",res));
        Task_16 b = new Task_16();
        System.out.println(b.Task16(4));
    }
}
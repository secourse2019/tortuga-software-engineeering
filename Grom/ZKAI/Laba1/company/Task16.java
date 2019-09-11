package com.company;

class Task_16 {
        public double Task16(int r) {
            int a =2;
            int n =10;
            for (int i = 1; i != n; ++i) {
                r *= a;
            }
            return r;
        }
    }


public class Task16{
    public static void main(String[] args) {

        Task_16 b = new Task_16();
        System.out.println(b.Task16(2));
    }
}
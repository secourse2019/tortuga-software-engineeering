package com.company;

class Task_30 {
    public double Task_30(int n, int a, int b) {
        int h = (b - a) / n;
        int res = 1;
        for (int i = 0; i != n; ++i) {
            res = (int) (1 - Math.sin(a + i * h));
        }
        return res;
    }
}
public class Task30{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int a = Integer.valueOf(args[1]);
        int b = Integer.valueOf(args[2]);
        System.out.println(String.format("%d %d %d",n,a,b));
        Task_30 c = new Task_30();
        System.out.println(c.Task_30(4,5,1));
    }
}
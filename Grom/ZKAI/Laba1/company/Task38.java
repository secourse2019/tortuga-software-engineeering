package com.company;

class Task_38 {
    public double Task_38(int n) {
        int res = 0;
        int ni;
        for (int i = 1; i != n; ++i) {
            ni = i;
            for (int i2 = 1; i2 != n - i; ++i2) ni *= i;
            res += ni;
        }
        return res;
    }
}

public class Task38{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",n));
        Task_38 b = new Task_38();
        System.out.println(b.Task_38(6));
    }
}
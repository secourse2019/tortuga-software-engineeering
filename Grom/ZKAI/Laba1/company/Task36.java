package com.company;

class Task_36 {
    public double Task_36 (int n , int k){
        int nk;
        int res = 0;
        for (int i = 1; i != n; ++i){
            nk = i;
            for (int i2 = 1; i2 != k; ++i2)
                nk *= i;
            res += nk;
        }
        return res;
    }
}

public class Task36{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int k = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d",n,k));
        Task_36 b = new Task_36();
        System.out.println(b.Task_36(4,9));
    }
}
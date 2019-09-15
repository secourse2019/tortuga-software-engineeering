package com.company;

class Task_18 {
    public double Task_18 (int res){
        int a = 2;
        int n = 10;
        int a2 = 2;
        for(int i = 2; i != n; ++i){
            a2 *= -a;
            res += a2;
        }
        return res;
    }
}

public class Task18{
    public static void main(String[] args) {
        int res = Integer.valueOf(args[0]);
        System.out.println(String.format("%d",res));
        Task_18 b = new Task_18();
        System.out.println(b.Task_18(1));
    }
}

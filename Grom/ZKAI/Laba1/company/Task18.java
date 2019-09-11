package com.company;

class Task_18 {
    public double Task_18 (int r){
        int a = 2;
        int n = 10;
        int a2 = 2;
        for(int i = 2; i != n; ++i){
            a2 *= -a;
            r += a2;
        }
        return r;
    }
}

public class Task18{
    public static void main(String[] args) {

        Task_18 b = new Task_18();
        System.out.println(b.Task_18(1));
    }
}

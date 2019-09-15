package com.company;

 class Task_6 {
    public double Task_6(int p) {
        int res = 1;
        float i;
        for (i = 1; i <= 2; i += 0.2) {
            res = (int) (p * i);
        }
        return res;
    }
}
public class Task6{
    public static void main(String[] args) {
        int p = Integer.valueOf(args[0]);
        System.out.println(String.format("%d" , p));
        Task_6 b = new Task_6();
        System.out.println(b.Task_6(10 ));
    }
}


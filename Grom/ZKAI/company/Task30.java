package com.company;

class Task_30 {
    public double Task_30(int a, int b, int c) {
        int k = 0;
        float temp;
        while ((a - c) >= 0) {
            a -= c;
            temp = b;
            while (temp - c >= 0) {
                temp -= c;
                ++k;
            }
            return k;
        }
        return 0;
    }
}

public class Task30{
    public static void main(String args []){
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[0]);
        int c = Integer.valueOf(args[0]);
        System.out.println(String.format("%d %d %d",a, b, c));
        Task_30 d = new Task_30();
        System.out.println(d.Task_30(5,4,7));
    }
}

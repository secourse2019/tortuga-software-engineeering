package com.company;

class Task_13 {
    public double Task_13 (float a){
        int k=1;
        float sum=1;
        while (sum <= a) {
            ++k;
            sum += (1 / (float)k);
        }
        return sum;
    }
}

public class Task13 {
    public static void main(String args[]) {
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_13 c = new Task_13();
        System.out.println(c.Task_13(2));

    }
}
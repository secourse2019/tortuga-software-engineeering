package com.company;

class Task_14 {
    public double Task_14 (float a ){
        int k=0;
        float sum=0;
        while (sum<=a) {
            ++k;
            sum+=1/(float)k;
        }
        return sum - (1 / (float) k);
    }
}

public class Task14 {
    public static void main(String args[]) {
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_14 c = new Task_14();
        System.out.println(c.Task_14(5));

    }
}
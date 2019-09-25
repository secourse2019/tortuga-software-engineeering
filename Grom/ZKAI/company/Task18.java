package com.company;

class Task_18 {
    public double Task_18 (int n){
        int sum = 0;
        int num = 0;
        while (n>0) {
            ++num;
            System.out.println(sum+=n%10);
            n /=10;
        }
        return sum;
    }
}

public class Task18{
    public static void main(String args []){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_18 c = new Task_18();
        double sum = c.Task_18(145);
        System.out.println(sum);
    }
}

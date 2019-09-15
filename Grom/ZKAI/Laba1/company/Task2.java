package com.company;

class Task_2 {
    public double Task_2(int repeat_count, int num) {
        for (int i = 0; i != repeat_count; ++i) {
            System.out.println(num);
        }
        return num;
    }

}
public class Task2 {
    public static void main (String[] args){
        int repeat_count = Integer.valueOf(args[0]);
        int num = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d", repeat_count, num));
        Task_2 b = new Task_2();
        System.out.println(b.Task_2(2,10));
    }

}

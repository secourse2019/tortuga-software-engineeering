package com.company;

class Task_2 {
    public double Task_2(int a , int b){
        int temp=a;
        int num=0;
        while (temp-b>=0){
            temp -= b;
            ++num;
        }
        return num;
    }
}

public class Task2 {
    public static void main (String[] args){
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d", a, b));
        Task_2 c = new Task_2();
        System.out.println(c.Task_2(8,4));
    }

}

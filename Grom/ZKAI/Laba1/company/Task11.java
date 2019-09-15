package com.company;



class Task_11{
    public double task_11 (double n){
        double temp = 0;
        for(int i = 0; i != n; ++i){
            temp += Math.pow(n + i, 2);
        }
        return temp;
    }
}


public class Task11 {
    public static void main(String[] args) {

        Task_11 b = new Task_11();
        System.out.println(b.task_11(10));

    }
}

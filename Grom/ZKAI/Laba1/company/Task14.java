package com.company;

 class Task_14 {
    public double Task_14(int s){
        int n = 20;
        for(int i = 1; i != n; ++i){
            s+=2*i-1;
        }
        return s;
    }
}

public class Task14{
    public static void main(String[] args) {

        Task_14 b = new Task_14();
        System.out.println(b.Task_14(3));
    }
}
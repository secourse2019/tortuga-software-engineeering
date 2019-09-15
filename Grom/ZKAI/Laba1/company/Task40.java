package com.company;

 class Task_40 {
    public double Task_40 (int a ,int b){
        int res = 1;
        for(int i = 1; i != b-a+1; ++i){
            for(int i2 = 1; i2 != i; ++i2){
                res = a+i+1;
            }
            return res;
        }
        return 0;
    }
 }

public class Task40{
    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d",a,b));
        Task_40 c = new Task_40();
        System.out.println(c.Task_40(2,7));
    }
}
package com.company;

 class Task_39 {
    public double Task_39 (int a , int b){
        for( int i = a; i != b; ++i){
            for(int i2 = i; i2 != i; ++i2 ){

            }
            return i;
        }
        return 0;
    }
 }

public class Task39{
    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d",a,b));
        Task_39 c = new Task_39();
        System.out.println(c.Task_39(2,3));
    }
}
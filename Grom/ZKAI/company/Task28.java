package com.company;

class Task_28 {
    public double Task_28 (float e){
        float ak1=0,ak=2;
        while (Math.abs(ak-ak1)>=e) {
            ak1=ak;
            ak=2+1/ak1;
        }
        return ak;
    }
 }

public class Task28{
    public static void main(String args []){
        int e = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", e));
        Task_28 c = new Task_28();
        System.out.println(c.Task_28(610));
    }
}
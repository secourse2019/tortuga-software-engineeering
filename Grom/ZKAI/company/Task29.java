package com.company;

class Task_29 {
    public double Task_29 (float e) {
        float ak1=1,ak=2,ak2;
        while (Math.abs(ak-ak1)>=e) {
            ak2=ak1;
            ak1=ak;
            ak=(ak2+2*ak1)/3;

        }
        return ak1;
    }
}

public class Task29{
    public static void main(String args []){
        int e = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", e));
        Task_29 c = new Task_29();
        System.out.println(c.Task_29(987));
    }
}
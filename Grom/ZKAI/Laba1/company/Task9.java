package com.company;

 class Task_9 {
    public double Task_9(int a, int b) {
        int sum = 0;
        for (int i = a; i != b; i++) {
            sum += i * i;
        }
        return sum;
    }

}
public class Task9 {
    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d",a,b));
        Task_9 c = new Task_9();
        System.out.println(c.Task_9(6, 10));
    }
}
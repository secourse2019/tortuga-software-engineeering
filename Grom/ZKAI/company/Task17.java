package com.company;

class Task_17 {
    private int ReverseNumber(int n) {
        int res = 0;

        while (n != 0) {
            res *= 10;
            res += n % 10;
            n /= 10;
        }

        return res;
    }

    public void Task_17 (int n) {
        n = ReverseNumber(n);

        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
      }
    }
 }

public class Task17{
    public static void main(String args []){
        int n = Integer.valueOf(args[0]);
        System.out.println(String.format("%d", n));
        Task_17 c = new Task_17();
        c.Task_17(25);
    }
}

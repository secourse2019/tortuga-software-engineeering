
package com.company;

 class Task_28 {
    public double Task_28 (int x, int n){
    int t1 = 1;
    int t2 = 1;
    int p = 1;
    int r = x;
    for(int i = 1; i != n; ++i){
        t1 *= 2*i-3;
        t2 *=2*i;
        p *=(-1)*x;
        r += t1*p/t2;
    }
    return r;
    }
 }

public class Task28{
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int x = Integer.valueOf(args[1]);
        System.out.println(String.format("%d %d",n,x));
        Task_28 b = new Task_28();
        System.out.println(b.Task_28(3,10));
    }
}


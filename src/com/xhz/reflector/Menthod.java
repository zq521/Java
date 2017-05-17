package com.xhz.reflector;

/**
 * Created by zhaoqiang on 2017/5/12.
 */
public class Menthod {
    public static void main(String[] args) {
        new Menthod();
    }

    public Menthod() {
        System.out.println(max(2, 3));
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }

    private int max1(int... args) {
        int maxValue = args[0];
        for (int i = 1; i < args.length; i++) {
            maxValue = max(maxValue, args[i]);
        }
        return maxValue;
    }

}

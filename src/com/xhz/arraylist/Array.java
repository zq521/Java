package com.xhz.arraylist;

/**
 * Created by zhaoqiang on 2017/5/12.
 */
public class Array {
    public static void main(String[] args) {

        int [] intArr=new int[10];
        intArr[1]=10;

        for (int anIntArr : intArr) {
            System.out.println(anIntArr);
        }
    }
}

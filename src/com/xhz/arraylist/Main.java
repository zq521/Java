package com.xhz.arraylist;

import com.xhz.arraylist.DynamicArray;

/**
 * Created by zhaoqiang on 2017/5/12.
 */
public class Main {
    public static void main(String[] args) {

        DynamicArray<String> arr=new DynamicArray<>(2);
        arr.add("DataType");
        arr.add("World");
        arr.add("XXX");
        arr.add("HHHH");




        System.out.println(arr.size());
        System.out.println(String.format("Capacity:%d",arr.getCurrentCapacity()));

        for (int i = 0; i <arr.size() ; i++) {
            System.out.println(arr.get(i));
        }

    }
}

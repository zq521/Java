package com.xhz.arraylist;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by zhaoqiang on 2017/5/12.
 */
public class DynamicArray<T> {

    private Object[] originalArray;
    private int length = 0;
    private int capacity;

    public DynamicArray() {
        this(32);
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        originalArray = new Object[capacity];

    }

    /**
     * Add a item to this array
     *
     * @param item The item to insert
     */

    public void add(T item) {

        if (length >= originalArray.length) {
            this.capacity *= 2;

            Object[] oldArray = originalArray;

            originalArray = new Object[this.capacity];

            for (int i = 0; i < oldArray.length; i++) {
                originalArray[i] = oldArray[i];
            }

        }
        originalArray[length] = item;
        length++;

    }

    /**
     * Get current capacity of original array
     *
     * @return The capacity
     */
    public int getCurrentCapacity() {
        return capacity;
    }

    /**
     * 读取
     * @param index
     * @return
     */
    public T get(int index){
        return (T) originalArray[index];
    }

    public int size(){
        return length;
    }


}

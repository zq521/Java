package com.xhz.name;

/**
 * Created by zhaoqiang on 2017/5/16.
 */
public class Hello {
    static final int STATE_A = 0b0001;
    static final int STATE_B = 0b0010;
    static final int STATE_C = 0b0100;
    static final int STATE_D = 0b1000;

    public static void main(String[] args) {


        byte q = 1;//1 (0-2的8次方-1)
        short s = 1;//2  Short

        int a = 1;//4
        Integer a1 = 1;

        long d = 4;//8
        Long l = 1L;

        float b = 2;//4
        Float b1 = 2.0F;

        double c = 3;//8字节
        Double c1 = 1.0;

        boolean f = true;//(false)
        char g = 'A';// 1

        int h = 8;
        int h1 = 0x8;//16进制
        int h2 = 0xA;
        int h3 = 0b100;//2进制

        int state = 0b1110;
        if (hasStateA(state)) {
            System.out.println("有状态A");
        }
        if (hasStateB(state)) {
            System.out.println("有状态B");

        }
        if (hasStateC(state)) {
            System.out.println("有状态C");
        }
        if (hasStateD(state)) {
            System.out.println("有状态D");

        }

    }

    static boolean hasStateA(int stateCode) {
        return (stateCode & STATE_A) == STATE_A;//!=0

    }

    static boolean hasStateB(int stateCode) {
        return (stateCode & STATE_B) == STATE_B;

    }

    static boolean hasStateC(int stateCode) {
        return (stateCode & STATE_C) == STATE_C;//!=0

    }

    static boolean hasStateD(int stateCode) {
        return (stateCode & STATE_D) == STATE_D;

    }
}

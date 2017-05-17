package com.xhz.annotations;

/**
 * Created by zhaoqiang on 2017/5/16.
 */
public class Human implements IHuman {
private String name;
private int age;
private int initMoney;

    public Human(String name,int age,int initMoney) {
        this.name=name;
        this.age=age;
        this.initMoney=initMoney;

    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    @RequireMoney
    public void eat() {
        System.out.println("吃饭");
    }

    public int getInitMoney() {
        return initMoney;
    }

    public void setInitMoney(int initMoney) {
        this.initMoney = initMoney;
    }

}

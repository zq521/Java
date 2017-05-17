package com.xhz.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.time.chrono.MinguoEra;

/**
 * Created by zhaoqiang on 2017/5/16.
 * JAVA注解
 */
public class Annotations {
    public static void main(String[] args) {
      new Annotations();
    }

    public Annotations() {
        Human h=new Human("xiohua",10,100);
        HumanEat(h);
        HumanEat(h);
        HumanEat(h);
        HumanEat(h);
        HumanEat(h);
        HumanEat(h);
        HumanEat(h);
        HumanEat(h);
        HumanEat(h);
        HumanEat(h);
        HumanEat(h);
        HumanEat(h);


    }
    void HumanEat(Human human){
        int coast=10;


        try {
            Method  methodEat = Human.class.getMethod("eat");
            RequireMoney  annotationRequireMoney = methodEat.getAnnotation(RequireMoney.class);
            if (annotationRequireMoney!=null){
                if (human.getInitMoney()>coast){
                    human.setInitMoney((human.getInitMoney()-coast));
                    human.eat();
                }else {
                    System.out.println("钱不够");

                }
            }
          //  System.out.println(annotationRequireMoney);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}

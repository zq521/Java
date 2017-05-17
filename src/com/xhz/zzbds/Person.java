package com.xhz.zzbds;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhaoqiang on 2017/5/16.
 * 验证身份证
 */
public class Person {
    public static void main(String[] args) {
        String str="xxxxxxxxxxxxxxxxxx";
        Pattern p=Pattern.compile("^\\d{6}(\\d{4})(\\d{2})(\\d{2})\\d{3}[\\dX]$");

        Matcher matcher = p.matcher(str);
        if (matcher.find()){
            //  System.out.println(matcher.group(0));
            String year=matcher.group(1);
            String month=matcher.group(2);
            String date=matcher.group(3);

            System.out.println(String.format("%s-%s-%s",year,month,date));
        }else {
            System.out.println("It's not a id number");

        }

    }
}

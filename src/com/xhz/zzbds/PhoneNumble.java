package com.xhz.zzbds;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhaoqiang on 2017/5/16.
 */
public class PhoneNumble {
    public static void main(String[] args) {
      String number="18234213114";
        Pattern p=Pattern.compile("^[1][3|8|5|7|4]\\d{9}$");

        Matcher matcher = p.matcher(number);
        if (matcher.find()){
            System.out.println(matcher.group(0));
        }else {
            System.out.println("不是正确的手机号");
        }

    }

}

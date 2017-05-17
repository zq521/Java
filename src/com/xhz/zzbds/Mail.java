package com.xhz.zzbds;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhaoqiang on 2017/5/16.
 */
public class Mail {
    public static void main(String[] args) {
        String str="727319870@qq.com";
        Pattern p=Pattern.compile("^/w{9}@[a-z]{2}.com$");
        Matcher matcher = p.matcher(str);
        if (matcher.find()){
            System.out.println(matcher.group(0));
        }else {
            System.out.println(" Mail is  Worng");
        }
    }
}

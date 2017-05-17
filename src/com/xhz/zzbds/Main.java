package com.xhz.zzbds;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhaoqiang on 2017/5/16.
 *  编译正则表达式
 */
public class Main {
    public static void main(String[] args) {

        String str = "Hello 200 World 100";
        // Pattern p=Pattern.compile(".{2}");
        //匹配一个数字
        //   \\d==[0-9]
        Pattern p = Pattern.compile("\\d+");

        Matcher matcher = p.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group(0));

        }
    }

}

package com.xhz.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoqiang on 2017/5/12.
 * 集合遍历
 */
public class Main {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("name","zhang");
        map.put("age","10");
//        System.out.println(map.get("getname"));
        // 一、foreach遍历
        for (String key:map.keySet()
             ) {
            System.out.println(String.format("%s=%s",key,map.get(key)));
//            System.out.println(map.entrySet());
        }
        //
//        List<String> list = new ArrayList<>();
//        list.add("hello");
//        list.add("world");
//        for (int i = 0; i < list.size() ; i++) {
//            System.out.println(list.get(i));
//        }
//        for (String str:list
//             ) {
//            System.out.println(str);
//        }

//        二、迭代器遍历
//        ListIterator<String> iterator = list.listIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}

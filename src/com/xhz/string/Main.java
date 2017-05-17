package com.xhz.string;

/**
 * Created by zhaoqiang on 2017/5/16.
 */
public class Main {
    public static void main(String[] args) {

//        String str = "DataType World";
//
//        String str1 = new String("DataType World");
//
//        String str2 = "DataType World";
//
//        System.out.println(str == str1);
//
//        String s = String.format("DataType %d,%f,%s,%c,%x,%o",100,3.14f,"World",'A',11,8);
//
//        System.out.println(s);
//
//        String numberString ="100";
//
//        Integer number=Integer.parseInt(numberString);//把字符串转成数字
//
//        System.out.println(100*3);
        //   String S=number+" ";

        // 反转Reverse String by using array
//        String str = "DataType World";
//        String[] strArr = str.split("");
//        String [] reversedArray=new String[strArr.length];
//        for (int i = strArr.length-1; i >=0 ; i--) {
//            reversedArray[strArr.length-i-1]=strArr[i];
//        }
//        StringBuilder  content=new StringBuilder();
//        for (String s:reversedArray
//             ) {
//            content.append(s);
//        }
//        System.out.println(content.toString());
//       // dumpArray(reversedArray);


        //Reverse string by charAt
//        String str="DataType World";
//        StringBuilder sb=new StringBuilder();
//        for (int i = str.length()-1; i >=0 ; i--) {
//            sb.append(str.charAt(i));
//        }
//        System.out.println(sb.toString());

        // 截取字符串
//        String str="He[llo Wo]rld";
//       // System.out.println(str.indexOf("l"));
//        int startIndex=str.indexOf("[")+1;
//        int endIndex=str.indexOf("]",startIndex);
//        String s=str.substring(startIndex,endIndex);
//        System.out.println(s);
        //字符串替换
        String str="DataType World";
        str= str.replace("o","d");
        // str= str.replaceFirst("o","d");//替换第一个
        System.out.println(str);



    }
    static void dumpArray(String[] arr) {
        for (String str :arr) {
            System.out.println(str);
        }
    }


}

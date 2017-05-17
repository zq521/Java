package com.xhz.zzbds;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhaoqiang on 2017/5/16.
 * 解析歌词文件
 */
public class ReadLRC {
    public static void main(String[] args) {

        Pattern p=Pattern.compile("^\\[(\\d{2}):(\\d{2})\\.\\d{2}\\](.*)$");

        File file=new File("song.lrc");
        try {
            FileInputStream in= new FileInputStream(file);
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line=br.readLine())!=null){
                Matcher matcher = p.matcher(line);
                if (matcher.find()){
                  //  System.out.println(matcher.group(4));
                    int min =Integer.parseInt(matcher.group(1));
                    int sec=Integer.parseInt(matcher.group(2));
                    String content =matcher.group(3);
                    System.out.println(String.format("总时间：%ds  %s",min*60+sec,content));
                }



            }

            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.javaCore.String;

import java.lang.String;
public class StringLearn {

    String s1 = "How are you ,";
    String s2 = "Tom";
    char[] s3 = new char[100];


    public static void main(String[] args){
        CountConsumeTime();
        CountStringBufferConsumeTime();
        CountStringStringBuilderTime();
    }
    //+法方式
    public static String concatString1(String s1,String s2){
        return s1+s2;
    }
    //concat方法：底层实现是使用StringBuder
    public static String concatString2(String s1,String s2){
        return s1.concat(s2);
    }

    //大量字符串拼接的时候问题：耗时间严重
    //每次拼接需要创建一个新的字符串，然后把老的字符串添加到新的字符串，耗费内存高、性能低
    public static void CountConsumeTime(){
        String s = "0";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s =s + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("consume time is "+(endTime- startTime));
    }

    //大量字符串使用的方法1:StringBuffer：线程安全
    public static void CountStringBufferConsumeTime(){
        StringBuffer sb = new StringBuffer();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("consume time is "+(endTime- startTime));
    }

    //大量字符串使用的方法2:StringBuider:非线程安全
    public static void CountStringStringBuilderTime(){
        StringBuilder sb = new StringBuilder("0");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("consume time is "+(endTime- startTime));
    }
    //字符串常用函数
    public void mainFunction(){
        //返回字符串长度
        s1.length();
        //返回字符串是否为空
        s1.isEmpty();
        //返回传入字符位置
        s1.charAt('x');
        //无返回，截取srcBegin到srcEnd到字符数组到dstBegin的位置后
//        srcBegin -- 字符串中要复制的第一个字符的索引。
//        srcEnd -- 字符串中要复制的最后一个字符之后的索引。
//        dst -- 目标数组。
//        dstBegin -- 目标数组中的起始偏移量。
        s1.getChars(1,2,s3,2);
        //返回匹配字符串的第一个位置下标
        //public int indexOf(String str, int fromIndex)
        s1.indexOf("are");
        //替换某一个字符或者字符
        s1.replace("H","h");
        //替换查找到的第一个
        s1.replaceFirst("H","h");


    }
}

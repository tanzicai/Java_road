package com.javaCore.String;

public class StringLearn {
    public static void main(String[] args){
        String s1 = "How are you ,";
        String s2 = "Tom";
        System.out.println(concatString1(s1,s2));
        System.out.println(concatString2(s1,s2));
    }
    //+法方式
    public static String concatString1(String s1,String s2){
        return s1+s2;
    }
    //concat方法
    public static String concatString2(String s1,String s2){
        return s1.concat(s2);
    }
}

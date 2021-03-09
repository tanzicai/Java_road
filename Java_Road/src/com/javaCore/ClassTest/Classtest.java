package com.javaCore.ClassTest;

public class Classtest {
    //类的设计包括：累的属性、方法等
    //类的首字母要求驼峰命名法
    //本文件以手机为参考

    //属性
    String model;
    String brand;
    int price;
    String owner;
    String number;

    public static void main(String[] args){

    }

    //打电话方法
    public boolean call(String PhoneNumber){
        System.out.println("正在给"+PhoneNumber+"打电话");
        if (PhoneNumber.length() == 11)return true;
        else return false;
    }

    //关机
    public boolean shutDown(){
        System.out.println("正在关及");
    }
}

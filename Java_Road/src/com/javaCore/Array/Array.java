package com.javaCore.Array;

public class Array {
    public static void main(String[] args){
        //数组创建
        //1.静态创建方法：内容开始知道
        //C-style array declaration of local variable 'age'
        int age[] = {10,20,30};
        //Java-style declaration
        String[] names = {"zhangsan","lisi"};

        //动态创建:内容开始不知道
        //C-style array declaration of local variable 'age'
        int age2[] = new int[10 ];
        //Java-style declaration
        String[] name2  =new String[10];

        //数据输入
        for (int i=0 ; i < 10;i++){
            age2[i] = i+1;
        }
        for (int num : age2)System.out.println(num);
        //数组声明示例
        /*
        int[] a;      = int[] a;
        int b[];      = int[] b;
        int[] c [];   = int[][] c;
        int[] d,e;    = int[] d;   int[] e;
        int f,g[];    = int f;   int[] g;
        int[] h,i,j[];= int[]h;   int i[];   int[][] j;
        */


    }
}

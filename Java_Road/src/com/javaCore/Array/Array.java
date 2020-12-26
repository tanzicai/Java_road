package com.javaCore.Array;

import java.util.Arrays;

import static java.util.Arrays.sort;

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

        //数组排序
        int[] arr1 = {1,2,3,4,5,33,2,1,3,4,21,213,31};
        String[] nam = new String[]{"Tom","Jane","Ai"};
        sort(arr1);
       sort(nam);
        for (int num:
             arr1) {
            System.out.println(num);
        }
        for (String name:
                nam) {
            System.out.println(name);
        }

    }
}

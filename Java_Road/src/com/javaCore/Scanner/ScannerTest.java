package com.javaCore.Scanner;

//添加Scanner包
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        int c;
        //创建扫描仪实例、对象
        //new关键字是从类实例化对象关键字
        //System.in是从默认设备实现标准输入
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入参数");

        //使用nextXX方法读入对应的数据
        //类型不匹配会报错并退出程序
        //一个扫描仪在关闭前面可以多次使用
        System.out.println("使用NextInt读入"+sc.nextInt());
        System.out.println("使用NextChar读入"+sc.nextBoolean());

        //最后调用close方法关闭扫描
        //避免造成内存泄漏
        sc.close();


    }

}

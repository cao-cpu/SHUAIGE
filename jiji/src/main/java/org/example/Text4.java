package org.example;

import java.util.Random;
import java.util.Scanner;

public class Text4 {
    public static void main(String[] args) {
        //打乱动态数组中的元素
        //1.定义一个动态数组
        int []arr=new int[5];
        //2.录入数组
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.printf("请输入数字：\n");
            arr[i]=sc.nextInt();
        }
        //3.轮流将数组每个索引与其他索引打乱
        //3.1首先定义一个变量arrindex存放索引
        int arrindex;
        //3.2定义随机变量
        // i 索引 arr[i] 数组
        Random r =new Random();
        for(int i=0;i<arr.length;i++){
            int x=r.nextInt(arr.length);
            arrindex=arr[i];
            arr[i]=arr[x];
            arr[x]=arrindex;
        }

        //4.数组已经打乱，遍历输出
        System.out.printf("数组打乱后是\n");
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d\n",arr[i]);
        }
    }
}

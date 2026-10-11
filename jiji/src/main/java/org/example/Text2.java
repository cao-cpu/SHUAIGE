package org.example;

import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        //找出动态数组中最大的数
        //1.定义一个动态数组
        int []arr=new int[10];
        //2.给数组录入数据
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.printf("请输入第%d个数字\n",i+1);
            arr[i]= sc.nextInt();
        }
        //3.定义最大数
        int max=arr[1];
        //4.利用for循环将其他数与max比较，若大于就更新max
        for(int i=1;i<arr.length;i++){
            if (max < arr[i]){
                max=arr[i];
            }
        }
        System.out.printf("最大值是%d",max);
    }
}
package org.example;

import java.util.Random;
import java.util.Scanner;

public class ReText2 {
    static void main() {
        //录入数组元素并打乱数组
        //sc录入数组
        Scanner scanner=new Scanner(System.in);
        int []arr= new int[5];
        for(int i =0;i<arr.length;i++){
            System.out.printf("请输入数字：\n");
            arr[i]=scanner.nextInt();
        }
        //打乱数组
        int arrindex,x;
        Random r=new Random();
        for(int i =0;i<arr.length;i++){
            arrindex=r.nextInt(arr.length);
            x=arr[i];
            arr[i]=arr[arrindex];
            arr[arrindex]=x;
        }
        //输出数组
        for(int i =0;i<arr.length;i++){
            System.out.printf("%d\n",arr[i]);
        }
    }
}

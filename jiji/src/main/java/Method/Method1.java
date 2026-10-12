package Method;

import java.util.Random;
import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {
        //主函数
        int[] arr = getarr(5);
        breakarr(arr);
        printarr(arr);
    }
    //方法
    //录入数组方法
    public static int[]getarr(int a){
        Scanner scanner=new Scanner(System.in);
        int []arr= new int[a];
        for(int i =0;i<arr.length;i++){
            System.out.printf("请输入数字：\n");
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
    //打乱数组方法
    public static void breakarr(int[] arr){
        Random r=new Random();
        for(int i=0;i<arr.length;i++){
            int x = r.nextInt(arr.length);
            int jb = arr[i];
            arr[i] = arr[x];
            arr[x] = jb;
        }
    }
    //输出数组方法
    public static int[] printarr(int[] arr){
        System.out.printf("数组打乱后是：\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\n", arr[i]);
        }
        return arr;
    }

}

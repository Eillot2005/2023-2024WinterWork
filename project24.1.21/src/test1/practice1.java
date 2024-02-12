package test1;

import java.util.Random;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //接收数据
//        int one;
//        int other;
//        one=sc.nextInt();
//        other=sc.nextInt();
//        if(one>other) System.out.println("true");
//        else System.out.println("false");

//        double b=Math.sqrt(12.0);
//        System.out.println(12+"的平方根为"+b);

        int x;
        x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int a = r.nextInt(3);
            System.out.println(a);
        }
    }
}

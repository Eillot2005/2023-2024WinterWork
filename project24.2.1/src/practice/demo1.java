package practice;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        int i=0;
        for(int k=str.length(),num=1;k>0;k--,num*=10)
        {
            i+=(str.charAt(k-1)-48)*num;
        }
        System.out.println(i);
    }
}

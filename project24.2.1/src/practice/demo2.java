package practice;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        str=sb.toString();
        int num=0;
        int i=0;
        while(true)
        {
            if(str.substring(i,i+1).equals(" "))
            {
                break;
            }
            else
            {
                num++;
                i++;
            }
        }
        System.out.println(num);
    }
}

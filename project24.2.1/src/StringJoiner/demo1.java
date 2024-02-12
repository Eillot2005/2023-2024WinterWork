package StringJoiner;

import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringJoiner stj=new StringJoiner(",","[","]");
        for(int i=1;i<9;i++)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(i);
            stj.add(sb.toString());
        }
        String str=stj.toString();
        System.out.println(str);
        String str1=new String("abcd");
        String str2=new String("abcd");
        String str3=str1+str2;
        System.out.println(str3);
        int index=str3.indexOf("bc");
        StringBuilder sb=new StringBuilder(str3);
        sb.insert(index,"dsa");
        str3=sb.toString();
        System.out.println(str3);
        Random rnum=new Random();
        for (int i=0;i<100;i++) {
            System.out.print(rnum.nextInt(10));
        }

    }
}

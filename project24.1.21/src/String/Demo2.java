package String;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        String a="apple";
        String b="cake";
        int c=b.compareTo(a);
        System.out.println(c);

        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        String sb=new StringBuilder().append(str).reverse().toString();
        System.out.println(sb.equals(str));




    }
}

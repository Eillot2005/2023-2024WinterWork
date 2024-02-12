package String;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++) {
            char a = str.charAt(i);
            System.out.println(a);
        }
    }
}

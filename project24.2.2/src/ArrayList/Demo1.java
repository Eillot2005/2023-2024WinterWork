package ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<student> arr1=new ArrayList<>();
        student s1=new student("a",1);
        student s2=new student("b",2);
        student s3=new student("c",3);
        arr1.add(s1);
        arr1.add(s2);
        arr1.add(s3);
        student s4=new student();
        s4.setName(sc.nextLine());
        s4.setOld(sc.nextInt());
        arr1.add(s4);

        for(int i=0;i<arr1.size();i++)
        {
            System.out.println(arr1.get(i).toString());
        }
        search(arr1);
        String str=new String();
    }

    
    public static void search(ArrayList<student> arr)
    {
        String name;
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i).getName().equals(name))
            {
                System.out.println(  "old:"+arr.get(i).getOld());
                break;
            }
        }
        System.out.println("false");

    }
}



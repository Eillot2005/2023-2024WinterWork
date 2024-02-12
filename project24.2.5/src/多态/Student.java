package 多态;

public class Student extends Person{

    public Student(String name,int age)
    {
        super(name,age);
    }
    @Override
    public void work() {
        System.out.println(getAge()+"的"+getName()+"  studying");
    }

    public void play()
    {
        System.out.println("playing");
    }
}

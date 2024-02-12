package 多态;

public class Teacher extends Person{
    public Teacher(String name,int age)
    {
        super(name,age);
    }
    public void work()
    {
        System.out.println(getAge()+"的"+getName()+"  teaching");
    }
}

package 多态;

public class text {
    public static void main(String[] args) {
        Person a=new Student("lyx",18);
        a.work();
        Student b=(Student) a;
        b.play();
    }
}

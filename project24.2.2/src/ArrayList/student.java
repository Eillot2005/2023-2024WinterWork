package ArrayList;

public class student {
    private String name;
    private int old;

    public student() {
    }

    public student(String name, int old) {
        this.name = name;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getOld() {
        return old;
    }


    public void setOld(int old) {
        this.old = old;
    }

    public String toString() {
        return "name = " + name + ", old = " + old ;
    }
}

package practice09.task3;

public class Student {
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void print() {
        System.out.println(id + " — " + name);
    }
}

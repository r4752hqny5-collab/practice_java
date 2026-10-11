package practice_4_1.task7;

public class Learner {
    private String name;
    private int age;

    public Learner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "имя=" + name + ", возраст=" + age;
    }
}

package practice_4_1.task7;

public class Schoolchild extends Learner {
    private int grade;

    public Schoolchild(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() { return grade; }

    @Override
    public String toString() {
        return "Школьник{" + super.toString() + ", класс=" + grade + "}";
    }
}

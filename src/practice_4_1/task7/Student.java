package practice_4_1.task7;

public class Student extends Learner {
    private String university;
    private int course;

    public Student(String name, int age, String university, int course) {
        super(name, age);
        this.university = university;
        this.course = course;
    }

    public String getUniversity() { return university; }
    public int getCourse() { return course; }

    @Override
    public String toString() {
        return "Студент{" + super.toString() + ", вуз=" + university
                + ", курс=" + course + "}";
    }
}

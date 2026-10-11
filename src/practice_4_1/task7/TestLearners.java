package practice_4_1.task7;

public class TestLearners {
    public static void main(String[] args) {
        Learner[] learners = {
                new Schoolchild("Анна", 15, 9),
                new Student("Иван", 19, "МИРЭА", 2),
                new Schoolchild("Максим", 17, 11),
                new Student("Мария", 18, "МИРЭА", 1)
        };

        System.out.println("Студенты:");
        for (Learner learner : learners) {
            if (learner instanceof Student) {
                System.out.println(learner);
            }
        }

        System.out.println("\nШкольники:");
        for (Learner learner : learners) {
            if (learner instanceof Schoolchild) {
                System.out.println(learner);
            }
        }
    }
}

package practice09.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> first = new ArrayList<>();
        first.add(new Student(7, "Анна"));
        first.add(new Student(2, "Иван"));

        List<Student> second = new ArrayList<>();
        second.add(new Student(6, "Оля"));
        second.add(new Student(1, "Маша"));

        List<Student> sortedFirst = mergeSort(first);
        List<Student> sortedSecond = mergeSort(second);
        List<Student> result = merge(sortedFirst, sortedSecond);

        for (Student student : result) {
            student.print();
        }
    }

    private static List<Student> mergeSort(List<Student> students) {
        if (students.size() <= 1) {
            return students;
        }

        int middle = students.size() / 2;
        List<Student> left = mergeSort(students.subList(0, middle));
        List<Student> right = mergeSort(students.subList(middle, students.size()));
        return merge(left, right);
    }

    private static List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            Student leftStudent = left.get(i);
            Student rightStudent = right.get(j);

            if (leftStudent.getId() <= rightStudent.getId()) {
                result.add(leftStudent);
                i++;
            } else {
                result.add(rightStudent);
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}

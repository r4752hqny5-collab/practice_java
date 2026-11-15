package practice17.task_1;


public class StudentList {
    private Student head;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Student student){
        student.next = head;
        head = student;
    }

    public void clear(){
        head = null;
    }

    public void printAt(int position){
        if (position < 1) {
            System.out.println("Номер должен быть не меньше 1");
            return;
        }
        Student student = head;

        int number = 1;

        while (student != null && number < position) {
            student = student.next;
            number++;
        }

        if (student == null) {
            System.out.println("Такой карточки нет");
            return;
        }

        student.print();


    }
    public void removeAt(int position) {
        if (position < 1) {
            System.out.println("Номер должен быть не меньше 1");
            return;
        }

        Student student = head;
        Student previous = null;
        int number = 1;

        while (student != null && number < position) {
            previous = student;
            student = student.next;
            number++;
        }

        if (student == null) {
            System.out.println("Такой карточки нет");
            return;
        }

        if (previous == null) {
            head = student.next;
        } else {
            previous.next = student.next;
        }
    }
}

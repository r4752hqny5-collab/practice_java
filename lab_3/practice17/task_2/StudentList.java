package practice17.task_2;

public class StudentList {
    private Student head;
    private Student tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Student student){
        student.next = head;
        student.prev = null;

        if (head == null) {
            tail = student;
        } else {
            head.prev = student;
        }

        head = student;
    }

    public void clear(){
        head = null;
        tail = null;
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
        int number = 1;

        while (student != null && number < position) {
            student = student.next;
            number++;
        }

        if (student == null) {
            System.out.println("Такой карточки нет");
            return;
        }

        Student previous = student.prev;
        Student next = student.next;

        if (previous == null) {
            head = next;
        } else {
            previous.next = next;
        }

        if (next == null) {
            tail = previous;
        } else {
            next.prev = previous;
        }
    }
}

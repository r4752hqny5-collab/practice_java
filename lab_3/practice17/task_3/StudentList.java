package practice17.task_3;

public class StudentList {
    private Student head;
    private Student tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Student student) {
        if (head == null) {
            head = student;
            tail = student;
            student.next = student;
            return;
        }
        student.next = head;
        head = student;
        tail.next = head;
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

        while (student != null && student != tail && number < position) {
            student = student.next;
            number++;
        }

        if (student == null || number != position) {
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
        Student previous = tail;
        int number = 1;

        while (student != null && student != tail && number < position) {
            previous = student;
            student = student.next;
            number++;
        }

        if (student == null || number != position) {
            System.out.println("Такой карточки нет");
            return;
        }

        if (head == tail) {
            clear();
            return;
        }

        previous.next = student.next;

        if (student == head) {
            head = student.next;
        }

        if (student == tail) {
            tail = previous;
        }
    }
}

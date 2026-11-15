package practice17.task_2;

import java.util.Scanner;

public class StudentListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList list = new StudentList();

        while (true) {
            System.out.println("1 — добавить студента");
            System.out.println("2 — показать карточку");
            System.out.println("3 — удалить карточку");
            System.out.println("4 — очистить список");
            System.out.println("5 — проверить, пуст ли список");
            System.out.println("0 — выйти");
            System.out.print("Выбери команду: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            if (command == 0) {
                return;
            }

            if (command == 1) {
                Student student = new Student();
                student.readConsole(scanner);
                list.addFirst(student);
                System.out.println("Карточка добавлена");
            } else if (command == 2 || command == 3) {
                System.out.print("Введите номер карточки: ");
                int position = scanner.nextInt();
                scanner.nextLine();

                if (command == 2) {
                    list.printAt(position);
                } else {
                    list.removeAt(position);
                }
            } else if (command == 4) {
                list.clear();
                System.out.println("Список очищен");
            } else if (command == 5) {
                if (list.isEmpty()) {
                    System.out.println("Список пуст");
                } else {
                    System.out.println("В списке есть карточки");
                }
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }

}


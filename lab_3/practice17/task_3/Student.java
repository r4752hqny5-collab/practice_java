package practice17.task_3;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    Student next;

    public void readConsole(Scanner scanner){
        System.out.print("введите имя: ");
        name = scanner.nextLine();
        System.out.print("введите возраст: ");
        age = scanner.nextInt();
        scanner.nextLine();
    }

    public void print(){
        System.out.println("имя: " + name);
        System.out.println("возраст: " + age);
    }

}
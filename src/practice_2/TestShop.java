package practice_2;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop(10);

        int choice;

        do {
            System.out.println("\n1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер");
            System.out.println("4. Показать все компьютеры");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("Введите модель: ");
                    String model = scanner.nextLine();

                    System.out.print("Введите цену: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    Computer_num24 computer = new Computer_num24(model, price);

                    if (shop.addComputer(computer)) {
                        System.out.println("Компьютер добавлен.");
                    } else {
                        System.out.println("Магазин заполнен.");
                    }

                    break;
                }
                case 2: {
                    System.out.print("Введите модель для удаления: ");
                    String model = scanner.nextLine();

                    if (shop.removeComputer(model)) {
                        System.out.println("Компьютер удалён.");
                    } else {
                        System.out.println("Компьютер не найден.");
                    }

                    break;
                }
                case 3: {
                    System.out.print("Введите модель для поиска: ");
                    String model = scanner.nextLine();

                    Computer_num24 found = shop.findComputer(model);

                    if (found != null) {
                        System.out.println("Найден компьютер: " + found);
                    } else {
                        System.out.println("Компьютер не найден.");
                    }

                    break;
                }
                case 4: {
                    shop.showComputers();
                    break;
                }

                case 0: {
                    System.out.println("Программа завершена.");
                    break;
                }

                default: {
                    System.out.println("Нет такого пункта меню.");
                    break;
                }
            }

        } while (choice != 0);
    }
}

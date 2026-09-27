import java.util.Scanner;

public class Num14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do{
            System.out.println("Введите количество элементов массива: ");
            size = scanner.nextInt();
        } while (size <= 0);
        int [] number = new int[size];

        int i = 0;
        do {
            System.out.println("Введите элемент" + (i + 1) + ": ");
            number[i] = scanner.nextInt();
            i++;

        } while (i < size);

        int sum = 0;
        int min_number = number[0];
        int max_number = number[0];

        i = 0;
        while (i < size){
            sum += number[i];

            if (number[i] < min_number){
                min_number = number[i];
            }

            if (number[i] > max_number){
                max_number = number[i];
            }
            i++;
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Минимальный элемент массива: " + min_number);
        System.out.println("Максимальный элемент массива: " + max_number);

    }
}

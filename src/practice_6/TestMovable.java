package practice_6;

public class TestMovable {
    public static void main(String[] args) {
        Movable point = new MovablePoint(10, 20, 2, 3);
        Movable circle = new MovableCircle(10, 20, 2, 3, 5);

        checkMovement("Точка", point);
        checkMovement("Окружность", circle);
    }

    private static void checkMovement(String title, Movable object) {
        System.out.println(title);
        System.out.println("Начальное состояние: " + object);

        object.moveUp();
        System.out.println("Вверх (x=10, y=17): " + object);

        object.moveRight();
        System.out.println("Вправо (x=12, y=17): " + object);

        object.moveDown();
        System.out.println("Вниз (x=12, y=20): " + object);

        object.moveLeft();
        System.out.println("Влево (x=10, y=20): " + object);
        System.out.println();
    }
}

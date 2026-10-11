package practice_7;

public class TestMovableRectangle {
    public static void main(String[] args) {
        Movable rectangle = new MovableRectangle(10, 20, 8, 6, 2, 3);

        System.out.println("Начальное состояние: " + rectangle);
        rectangle.moveUp();
        System.out.println("Вверх (x=10, y=17): " + rectangle);
        rectangle.moveRight();
        System.out.println("Вправо (x=12, y=17): " + rectangle);
        rectangle.moveDown();
        System.out.println("Вниз (x=12, y=20): " + rectangle);
        rectangle.moveLeft();
        System.out.println("Влево (x=10, y=20): " + rectangle);
    }
}

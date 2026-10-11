package practice_4_1.task8;

public class TestShapes {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(2, "blue", false),
                new Rectangle(3, 4, "green", true),
                new Square(5, "yellow", true)
        };

        // Родительская ссылка вызывает реализацию конкретного подкласса.
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.printf("Площадь: %.2f; периметр: %.2f%n",
                    shape.getArea(), shape.getPerimeter());
        }

        Shape circle = shapes[0];
        circle.setColor("white");
        circle.setFilled(true);
        ((Circle) circle).setRadius(3);
        require(circle.getColor().equals("white") && circle.isFilled(), "Поля Shape");
        require(Math.abs(circle.getArea() - 9 * Math.PI) < 1e-9, "Площадь круга");
        require(Math.abs(circle.getPerimeter() - 6 * Math.PI) < 1e-9, "Периметр круга");

        Rectangle rectangle = (Rectangle) shapes[1];
        rectangle.setWidth(2);
        rectangle.setLength(6);
        require(rectangle.getArea() == 12 && rectangle.getPerimeter() == 16,
                "Расчёт прямоугольника");

        Square square = (Square) shapes[2];
        square.setSide(3);
        require(square.getArea() == 9 && square.getPerimeter() == 12, "Расчёт квадрата");
        Rectangle squareAsRectangle = square;
        squareAsRectangle.setWidth(6);
        require(square.getSide() == 6 && square.getLength() == 6, "setWidth квадрата");
        squareAsRectangle.setLength(7);
        require(square.getWidth() == 7 && square.getLength() == 7, "setLength квадрата");

        Shape[] constructors = {new Circle(), new Circle(2), new Rectangle(),
                new Rectangle(2, 3), new Square(), new Square(2)};
        for (Shape shape : constructors) {
            require(shape.getArea() > 0 && shape.getPerimeter() > 0, "Конструктор");
        }
        System.out.println("Проверки конструкторов, методов и свойств квадрата пройдены.");

        // new Shape() запрещён: класс абстрактный.
        // circle.getRadius() запрещён: такого метода нет в типе Shape.
        // Радиус доступен после приведения: ((Circle) circle).getRadius().
    }

    private static void require(boolean condition, String description) {
        if (!condition) {
            throw new AssertionError("Не пройдена проверка: " + description);
        }
    }
}

package practice_4_1.task8;

public class Circle extends Shape {
    protected double radius;

    public Circle() { this(1.0); }
    public Circle(double radius) { this(radius, "red", true); }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        if (!Double.isFinite(radius) || radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным конечным числом.");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() { return Math.PI * radius * radius; }
    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
    @Override
    public String toString() {
        return "Circle{radius=" + radius + ", " + super.toString() + "}";
    }
}

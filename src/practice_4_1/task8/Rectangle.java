package practice_4_1.task8;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() { this(1.0, 1.0); }
    public Rectangle(double width, double length) {
        this(width, length, "red", true);
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        checkDimension(width);
        checkDimension(length);
        this.width = width;
        this.length = length;
    }

    protected static void checkDimension(double value) {
        if (!Double.isFinite(value) || value <= 0) {
            throw new IllegalArgumentException("Размер должен быть положительным конечным числом.");
        }
    }

    public double getWidth() { return width; }
    public void setWidth(double width) {
        checkDimension(width);
        this.width = width;
    }
    public double getLength() { return length; }
    public void setLength(double length) {
        checkDimension(length);
        this.length = length;
    }

    @Override
    public double getArea() { return width * length; }
    @Override
    public double getPerimeter() { return 2 * (width + length); }
    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", length=" + length
                + ", " + super.toString() + "}";
    }
}

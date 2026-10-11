package practice_7;

public class MovableRectangle implements Movable {
    private int x;
    private int y;
    private int width;
    private int height;
    private int xSpeed;
    private int ySpeed;

    public MovableRectangle(int x, int y, int width, int height,
                            int xSpeed, int ySpeed) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Размеры должны быть больше нуля.");
        }
        if (xSpeed < 0 || ySpeed < 0) {
            throw new IllegalArgumentException("Скорости не должны быть отрицательными.");
        }
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // x и y — координаты верхнего левого угла; y растёт вниз.

    public void moveUp() {
        y -= ySpeed;
    }

    public void moveDown() {
        y += ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }

    public String toString() {
        return "MovableRectangle{x=" + x + ", y=" + y
                + ", width=" + width + ", height=" + height
                + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "}";
    }
}

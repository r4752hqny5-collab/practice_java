package practice_4.task1;

public enum Season {
    // Учебные средние температуры, градусы Цельсия.
    WINTER(-10), SPRING(10), SUMMER(25), AUTUMN(8);

    private final double averageTemperature;

    private Season(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }
}

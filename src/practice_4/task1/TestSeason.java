package practice_4.task1;

public class TestSeason {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println("Время года: " + season);
        System.out.println("Температура из конструктора: "
                + season.getAverageTemperature() + " °C");
    }
}

package practice_2;

public class Computer_num24 {
    private String model;
    private double price;

    public Computer_num24(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Модель: " + model + ", цена: " + price;
    }
}

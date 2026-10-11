package practice_2;

public class Shop {
    private Computer_num24[] computers;
    private int count;

    public Shop(int capacity) {
        computers = new Computer_num24[capacity];
        count = 0;
    }

    public boolean addComputer(Computer_num24 computer) {
        if (count == computers.length) {
            return false;
        }

        computers[count] = computer;
        count++;

        return true;
    }

    public Computer_num24 findComputer(String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {
                return computers[i];
            }
        }

        return null;
    }

    public boolean removeComputer(String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {

                for (int j = i; j < count - 1; j++) {
                    computers[j] = computers[j + 1];
                }

                count--;
                computers[count] = null;

                return true;
            }
        }

        return false;
    }

    public void showComputers() {
        if (count == 0) {
            System.out.println("Магазин пуст.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + computers[i]);
        }
    }
}

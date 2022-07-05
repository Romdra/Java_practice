package Exercise_N2;

public class Mayweed extends Flower {

    private String name;

    public Mayweed(String name, String country, int daysLife, double price) {

        super(country, daysLife, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

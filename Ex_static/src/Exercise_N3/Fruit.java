package Exercise_N3;

public abstract class Fruit {

    private double weight;

    public abstract double getPrice();

    public Fruit(double weight) {

        this.weight = weight;
    }

    public void printManufacturerInfo() {

        System.out.print("Made in Russia");
    }

    public double getWeight() {
        return weight;
    }
}

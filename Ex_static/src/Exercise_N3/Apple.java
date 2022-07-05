package Exercise_N3;

public class Apple extends Fruit{

    private double priceForOneKg;

    public Apple(double priceForOneKg, double weight) {

        super(weight);
        this.priceForOneKg = priceForOneKg;
    }

    @Override
    public double getPrice() {
        return Math.ceil(priceForOneKg * this.getWeight());
    }
}

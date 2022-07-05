package Exercise_N2;

public class Flower {

    private String country;
    private int daysLife;
    private double price;
    private static int flowerCount = 0;

    public Flower(String country, int daysLife, double price) {

        this.country = country;
        this.daysLife = daysLife;
        this.price = price;
    }

    public static int sumPrice(Flower[] flowers) {

        int sum = 0;
        for (int i = 0; i < flowers.length; i++) {
            sum += flowers[i].getPrice();
        }
        return sum;
    }

    public static int sellFlowers(Flower[]...flowers) {

        for (int i = 0; i < flowers.length; i++) {
            flowerCount += flowers[i].length;
        }
        return flowerCount;
    }

    public String getCountry() {
        return country;
    }

    public int getDaysLife() {
        return daysLife;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

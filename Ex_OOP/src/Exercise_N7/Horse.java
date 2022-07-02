package Exercise_N7;

public class Horse extends Animal {

    private int speed;

    public Horse(String food, String location, int speed) {

        super(food, location);
        this.speed = speed;
    }

    public void makeNoise() {

        System.out.println("Лошадь говорит иго-го.");
    }
    public void eat() {

        System.out.printf("Лошадь питается вот этим: %s.", super.getFood());
    }
}

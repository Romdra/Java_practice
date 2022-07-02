package Exercise_N7;

public class Animal {

    private String food;
    private String location;

    public Animal(String food, String location) {

        this.food = food;
        this.location = location;
    }

    public void makeNoise() {

        System.out.println("Животное говорит вот так.");
    }
    public void eat() {

        System.out.printf("Животное питается вот этим: %s.", this.food);
    }
    public void sleep() {

        System.out.println("Животное спит.");
    }

    public String getFood() { return this.food; }
    public String getLocation() { return this.location; }
}

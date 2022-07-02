package Exercise_N7;

public class Cat extends Animal {

    private String breed;

    public Cat(String food, String location, String breed) {

        super(food, location);
        this.breed = breed;
    }

    public void makeNoise() {

        System.out.println("Кошка говорит мяу.");
    }
    public void eat() {

        System.out.printf("Кошка питается вот этим: %s.", super.getFood());
    }
}

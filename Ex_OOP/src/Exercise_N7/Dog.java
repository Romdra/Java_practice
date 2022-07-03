package Exercise_N7;

public class Dog extends Animal {

    private int age;

    public Dog(String food, String location, int age) {

        super(food, location);
        this.age = age;
    }

    public void makeNoise() {

        System.out.println("Собака говорит гав.");
    }
    public void eat() {

        System.out.printf("Собака питается вот этим: %s.", super.getFood());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

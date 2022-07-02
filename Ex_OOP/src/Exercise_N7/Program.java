package Exercise_N7;

public class Program {

    public static void main(String[] args) {

        Vet vet = new Vet("Иван");
        Cat cat = new Cat("Китикэт", "Улица", "Дворняга");
        Dog dog = new Dog("Педигри", "Дом", 5);
        Horse horse = new Horse("Морковка", "Прерия", 76);

        Animal[] animals = {cat, dog, horse};

        for (int i = 0; i < animals.length; i++) {

            vet.treatAnimal(animals[i]);
        }
    }
}

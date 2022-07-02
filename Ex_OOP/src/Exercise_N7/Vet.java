package Exercise_N7;

public class Vet {

    private String name;

    public Vet(String name) {

        this.name = name;
    }

    public void treatAnimal(Animal animal) {

        System.out.printf("Животное питается этой пищей: %s\nНаходится в этом месте: %s\n\n",
                animal.getFood(), animal.getLocation());
    }
}

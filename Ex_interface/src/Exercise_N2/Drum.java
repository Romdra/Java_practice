package Exercise_N2;

public class Drum implements Instrument {

    private String size;

    public Drum(String size) {

        this.size = size;
    }

    public void play() {

        System.out.println("Играет барабан, такого размера: " + this.size);
    }
}

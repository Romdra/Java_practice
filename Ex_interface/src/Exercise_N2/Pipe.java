package Exercise_N2;

public class Pipe implements Instrument {

    private int diameter;

    public Pipe(int diameter) {

        this.diameter = diameter;
    }

    public void play() {

        System.out.println("Играет труба, диаметром " + this.diameter + " см.");
    }
}

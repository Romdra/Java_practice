package Exercise_N2;

public class Guitar implements Instrument {

    private int valueCord;

    public Guitar(int valueCord) {

        this.valueCord = valueCord;
    }

    public void play() {

        System.out.println("Играет гитара, с " + this.valueCord + " струнами.");
    }
}

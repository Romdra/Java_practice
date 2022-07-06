package Exercise_N2;

public class ExeN2Demo {

    public static void main(String[] args) {

        Guitar guitar = new Guitar(6);
        Drum drum = new Drum("Big");
        Pipe pipe = new Pipe(20);

        Instrument[] instruments = {guitar, drum, pipe};

        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();
        }
    }
}

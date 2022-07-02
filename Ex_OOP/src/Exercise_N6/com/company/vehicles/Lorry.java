package Exercise_N6.com.company.vehicles;

import Exercise_N6.com.company.details.Engine;
import Exercise_N6.com.company.professions.Driver;

public class Lorry extends Car {

    private int carrying;

    public Lorry(String model, String carClass, double weight, Driver driver, Engine engine, int carrying) {

        super(model, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    public void printString() {

        super.printString();
        System.out.printf("Грузоподъемность: %d", this.carrying);
    }
}

package Exercise_N6.com.company.vehicles;

import Exercise_N6.com.company.details.Engine;
import Exercise_N6.com.company.professions.Driver;

public class SportCar extends Car {

    private double speed;

    public SportCar(String model, String carClass, double weight, Driver driver, Engine engine, double speed) {

        super(model, carClass, weight, driver, engine);
        this.speed = speed;
    }

    public String toString() {

        super.toString();
        return " Максимальная скорость: " + this.speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}

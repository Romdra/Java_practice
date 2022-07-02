package Exercise_N6.com.company.vehicles;

import Exercise_N6.com.company.details.*;
import Exercise_N6.com.company.professions.*;

public class Car {

    private String model;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String model, String carClass, double weight, Driver driver, Engine engine) {

        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {

        System.out.println("Поехали");
    }
    public void stop() {

        System.out.println("Останавливаемся");
    }
    public void turnRight() {

        System.out.println("Поворот на право");
    }
    public void turnLeft() {

        System.out.println("Поворот на лево");
    }
    public void printString() {

        System.out.printf("Модель: %s Класс: %s Вес: %f Производитель: %s Мощность: %d\n Водитель: %s Стаж: %f\n",
                this.model, this.carClass, this.weight, this.engine.getCompany(),
                this.engine.getPower(), this.driver.getFullName(), this.driver.getExperience());
    }
}

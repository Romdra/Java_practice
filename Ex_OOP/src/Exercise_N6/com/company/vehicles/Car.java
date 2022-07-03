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
    public String toString() {

        return "Модель: " + this.model + " Класс: " + this.carClass + " Вес: " + this.weight +
                " Производитель: " + this.engine.getCompany() + " Мощность: " + this.engine.getPower() +
                " Водитель: " + this.driver.getFullName() + " Стаж: " + this.driver.getExperience();
    }
}

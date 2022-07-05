package Exercise_N4;

public class Exe4Demo {

    public static void main(String[] args) {

        Circle circle = new Circle(4.5);
        Circle circle1 = new Circle(7.0);

        System.out.println("Площадь первого круга: " + circle.areaCircle());
        System.out.println("Длина окружности первого круга: " + circle.circumference());
        System.out.println();
        System.out.println("Площадь второго круга: " + circle1.areaCircle());
        System.out.println("Длина окружности второго круга: " + circle1.circumference());

    }
}

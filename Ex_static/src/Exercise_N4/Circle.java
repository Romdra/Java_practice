package Exercise_N4;

public class Circle {

    private double radius;
    final double PI = 3.14;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double areaCircle() {

        return Math.floor(PI * Math.pow(radius, 2));
    }

    public double circumference() {

        return Math.floor(2 * PI * radius);
    }
}

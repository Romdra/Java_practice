package Exercise_N5;

public class Aspirant extends Student {

    public Aspirant(String firstName, String lastName, String group, double averageMark) {

        super(firstName, lastName, group, averageMark);
    }

    public void getScholarship(double averageMark) {
        if (averageMark == 5.0) System.out.println("Стипендия 200 рублей");
        else System.out.println("Стипендия 180 рублей");
    }
}

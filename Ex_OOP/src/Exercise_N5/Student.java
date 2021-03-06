package Exercise_N5;

public class Student {

    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void getScholarship(double averageMark) {
        if (averageMark == 5.0) System.out.println("Стипендия 100 рублей");
        else System.out.println("Стипендия 80 рублей");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}

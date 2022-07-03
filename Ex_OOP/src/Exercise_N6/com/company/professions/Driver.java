package Exercise_N6.com.company.professions;

public class Driver extends Person {

    private double experience;

    public Driver(String fullName, int age, double experience) {

        super(fullName, age);
        this.experience = experience;
    }

    public String getFullName() {

        return super.getFullName();
    }
    public double getExperience() {

        return this.experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
}

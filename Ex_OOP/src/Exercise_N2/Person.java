package Exercise_N2;

public class Person {

    private String fullName;
    private int age;

    public Person(String fullName, int age) {

        this.fullName = fullName;
        this.age = age;
    }

    public void talk() {

        System.out.printf("Этот %s говорит", this.fullName);
    }

    public void move() {

        System.out.printf("Этот %s идёт", this.fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

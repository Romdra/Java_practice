package Exercise_N5;

public class Program {

    public static void main(String[] args) {

        Student student = new Aspirant("Ivan", "Ivanov", "L-700", 4.6);
        Student student1 = new Student("Alex", "Sergeev", "L-680", 5.0);
        Student student2 = new Student("Igor", "Messi", "L-700", 3.2);
        Aspirant aspirant = new Aspirant("Terenas", "Menetil", "L-500", 4.3);
        Aspirant aspirant1 = new Aspirant("Arthas", "Menetil", "L-980", 5.0);

        Student[] students = {student, student1, student2, aspirant, aspirant1};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getFirstName());
            students[i].getScholarship(students[i].getAverageMark());
            System.out.println();
        }
    }
}

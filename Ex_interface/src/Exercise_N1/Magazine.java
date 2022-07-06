package Exercise_N1;

public class Magazine implements Printable {

    private String name;
    private String theme;

    public Magazine(String name, String theme) {

        this.name = name;
        this.theme = theme;
    }

    public void print() {

        System.out.println("Название журнала: " + this.name + " Тема журнала: " + this.theme);
    }
    public static void printMagazines(Printable[] printable) {

        for (int i = 0; i < printable.length; i++) {
            if (printable[i]  instanceof Magazine) {
                System.out.println("Название журнала: " + ((Magazine) printable[i]).getName());
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getTheme() {
        return theme;
    }
}

package Exercise_N1;

public class Book implements Printable {

    private String name;
    private String author;

    public Book(String name, String author) {

        this.name = name;
        this.author = author;
    }

    public void print() {

        System.out.println("Название книги: " + this.name + " Автор книги: " + this.author);
    }

    public static void printMagazines(Printable[] printable) {

        for (int i = 0; i < printable.length; i++) {
            if (printable[i]  instanceof Book) {
                System.out.println("Название книги: " + ((Book) printable[i]).getName());
            }
        }
    }

    public String getName() {

        return name;
    }

    public String getAuthor() {

        return author;
    }
}

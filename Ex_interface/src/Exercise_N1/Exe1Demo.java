package Exercise_N1;

public class Exe1Demo {

    public static void main(String[] args) {

        Book book1 = new Book("Гарри Поттер", "Джоан Роулинг");
        Book book2 = new Book("Воля к власти", "Фридрих Ницше");
        Book book3 = new Book("Ученица", "Тара Вестовер");
        Magazine magazine1 = new Magazine("Mens Health", "Health");
        Magazine magazine2 = new Magazine("Cosmopolitan", "For women");
        Magazine magazine3 = new Magazine("Maxim", "For men");

        Printable[] paper = {book1, book2, book3, magazine1, magazine2, magazine3};

        for (int i = 0; i < paper.length; i++) {
            paper[i].print();
        }


    }
}

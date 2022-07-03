package Exercise_N4;

public class Book {

    private String genre;
    private String author;

    public Book(String author, String genre) {

        this.author = author;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }
}

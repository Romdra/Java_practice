package Exercise_N4;

import java.util.Date;

public class Reader {

    private String fullName;
    private String id;
    private String faculty;
    private String birthday;
    private String phoneNumber;

    public Reader(String fullName, String id, String faculty, String birthday, String phoneNumber) {

        this.fullName = fullName;
        this.id = id;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int countBook) {

        System.out.printf("%s взял %d книги", this.fullName, countBook);
    }
    public void takeBook(String...book) {

        System.out.printf("%s  взял книги: ", this.fullName);
        for (int i = 0; i < book.length; i++) {
            System.out.print(book[i]);
        }
    }
    public void takeBook(Book...books) {

        System.out.printf("%s  взял книги: ", this.fullName);
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getGenre());
        }
    }

    public void returnBook(int countBook) {


        System.out.printf("%s вернул %d книги", this.fullName, countBook);
    }
    public void returnBook(String...book) {

        System.out.printf("%s  вернул книги: ", this.fullName);
        for (int i = 0; i < book.length; i++) {
            System.out.print(book[i]);
        }
    }
    public void returnBook(Book...books) {

        System.out.printf("%s  вернул книги: ", this.fullName);
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getGenre());
        }
    }

    public String getFullName() {
        return fullName;
    }

    public String getId() {
        return id;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

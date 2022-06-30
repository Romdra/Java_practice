package Exercise_N4;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Reader reader = new Reader("Петров В.В", "3341i8",
                "МехМат", "22.12.1998", "9052551424");
        Reader reader1 = new Reader("Иванов В.В", "3561i8",
                "ФКН", "11.11.1989", "5216652145");
        Reader reader2 = new Reader("Сидоров А.Г", "3788i8",
                "Филологический", "13.06.1977", "9553221458");
        Reader reader3 = new Reader("Ахметьева Е.А", "1231i9",
                "Экономический", "01.01.2000", "9009551235");

        Reader[] library = {reader, reader1, reader2, reader3};
    }
}

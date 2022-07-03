package Exercise_N1;

public class Program {

    public static void main(String[] args) {

        Phone phone1 = new Phone("+790270601123", "Iphone SE");
        Phone phone2 = new Phone("+790500423415", "Samsung A12", 56.0);
        Phone phone3 = new Phone("+722463257734", "Xiaomi Mi500", 90.0);

        System.out.printf("Номер: %s\nМодель: %s\n\n", phone1.getNumber(),
                phone1.getModel());
        System.out.printf("Номер: %s\nМодель: %s\nВес: %.2f гр\n\n", phone2.getNumber(),
                phone2.getModel(), phone2.getWeight());
        System.out.printf("Номер: %s\nМодель: %s\nВес: %.2f гр\n\n", phone3.getNumber(),
                phone3.getModel(), phone3.getWeight());

        phone1.receiveCall("Валентин", "+79683456769");
        phone1.sendMessage("+790270601123", "+790270601123", "+790270601123", "+790270601123");
    }
}

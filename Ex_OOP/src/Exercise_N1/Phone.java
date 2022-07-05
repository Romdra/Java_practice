package Exercise_N1;

public class Phone {

    private String number;
    private String model;
    private double weight;
    private static int phoneCounter = 0;

    public Phone() {
        phoneCounter++;
    }

    public Phone(String number, String model) {

        this();
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, double weight) {

        this();
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public void receiveCall(String name) {

        System.out.printf("Звонит: %s", name);
    }

    public void receiveCall(String name, String number) {

        System.out.printf("Звонок от %s\n %s\n", name, number);
    }

    public void sendMessage(String...arg) {

        System.out.println("Сообщение отправлено этим абонентам: \n");
        for (int i = 0; i < arg.length; i++) {
            System.out.println(arg[i]);
        }
    }

    public String getNumber() {

        return this.number;
    }
    public void setNumber(String number) {

        this.number = number;
    }
    public String getModel() {

        return this.model;
    }
    public void setModel(String model) {

        this.model = model;
    }
    public double getWeight() {

        return this.weight;
    }
    public void setWeight(double weight) {

        this.weight = weight;
    }

    public static int getPhoneCounter() {

        return phoneCounter;
    }
}

package Exercise_N2;

public class Exe2Demo {

    public static void main(String[] args) {

        Rose rose = new Rose("Роза", "Азербайджан", 13, 112);
        Pink pink = new Pink("Гвоздика", "Казахстан", 18, 70);
        Tulip tulip = new Tulip("Тюльпан", "Белоруссия", 14, 148);
        Mayweed mayweed = new Mayweed("Ромашка", "Россия", 30, 57);

        Flower[] bouquet = {rose, rose, rose, rose, rose, rose, rose, rose, tulip};
        Flower[] bouquet1 = {pink, pink, pink, pink, pink, pink, tulip, tulip, tulip, tulip, tulip};
        Flower[] bouquet2 = {mayweed, mayweed, mayweed, mayweed, mayweed, mayweed, mayweed, mayweed, mayweed,
                            mayweed, mayweed, mayweed, mayweed, mayweed, mayweed, mayweed, mayweed};

        System.out.println("Цена за первый букет: " + Flower.sumPrice(bouquet));
        System.out.println("Цена за второй букет: " + Flower.sumPrice(bouquet1));
        System.out.println("Цена за третий букет: " + Flower.sumPrice(bouquet2));
        System.out.println("Количество проданных цветов: " + Flower.sellFlowers(bouquet, bouquet1, bouquet2));
    }
}

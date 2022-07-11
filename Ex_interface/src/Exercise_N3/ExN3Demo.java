package Exercise_N3;

public class ExN3Demo {

    public static void main(String[] args) {

        Season[] seasons = Season.values();

        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i] + " " + seasons[i].getAvgTemp() +
                    " " + seasons[i].getDescription());
        }
    }

    public static void loveSeason(Season season) {
        switch (season){

            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            default:
                System.out.println("Это не время года.");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        int ticketPrice = 13_676;               // стоимость билета
        int forOneMile = 20;                    // количество рублей для одной бонусной мили

        int miles;

        miles = ticketPrice / forOneMile;       // Рассчет количество бонусных миль

        System.out.println(miles);

    }
}


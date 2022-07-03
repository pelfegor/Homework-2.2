public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int donate = 900;
        boolean condition = donate > 1000;
        int balance = amount + donate;
        int bonus = condition ? donate / 100 : 0;

        amount = condition ? balance + bonus : balance;
        System.out.println("Итоговый счет: " + amount);
        System.out.println("Количество бонусных рублей: " + bonus);

        /*
        int amount = 100;
        int donate = 1100;
        int balance = amount + donate;

        if (donate > 1000) {
            int bonus = donate/100;
            amount = balance + bonus;
            System.out.println("Итоговый счет: " + amount);
            System.out.println("Количество бонусных рублей: " + bonus);
        } else {
            int bonus = 0;
            amount = balance;
            System.out.println("Итоговый счет: " + amount);
            System.out.println("Количество бонусных рублей: " + bonus);
        }
        */

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
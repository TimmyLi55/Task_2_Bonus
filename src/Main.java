public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int bill = 100;
        int refill = 6000;
        int bonusConst = 1000;
        int oneBonusFor = 100;
        int bonusBill = 0;
        if (refill > bonusConst) {
            bonusBill = refill / 100;
            bill = bonusBill + bill + refill;
        } else {
            bill = bill + refill;
        }
        System.out.println("Спасибо что пополнили счет на " + refill + " руб.");
        System.out.println("На вашем счете " + bill + " руб. В том числе бонусных руб. " + bonusBill);
        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}

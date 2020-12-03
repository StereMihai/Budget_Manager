package budget;

public class Income {

    private static double amount = 0;


    public static double getAmount() {
        return amount;
    }

    public static double addIncome(double sum) {
        return amount += sum;
    }

    public static double subtractionIncome(double sum) {

        if (amount - sum <=0) {
            amount = 0;
        }
            return amount -= sum;

    }
}

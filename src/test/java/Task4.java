import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter exchange rate: ");
        double exchangeRate = scanner.nextDouble();

        System.out.println("Enter amount in USD: ");
        double amount = scanner.nextDouble();

        System.out.println("Enter exchange fee: ");
        double exchangeFee = scanner.nextDouble();

        scanner.close();

        double eurReceived = currencyExchangeCalculator(exchangeRate, amount, exchangeFee);
        System.out.println("You will receive " + eurReceived + " EUR");
    }

    public static double currencyExchangeCalculator(double exchangeRate, double amount, double exchangeFee){
        return amount*exchangeRate*(1-exchangeFee/100);
    }
}

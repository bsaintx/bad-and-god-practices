import java.util.Locale;
import java.util.Scanner;

public class AverageCalcGP {
    public static void main(String[] args) {

        Locale usLocale = new Locale("en", "US");
        Scanner scanner = new Scanner(System.in).useLocale(usLocale);

        System.out.println("Average Calculator");

        double number1 = getNumberFromUser(scanner, "Enter the first number: ");
        double number2 = getNumberFromUser(scanner, "Enter the second number: ");
        double number3 = getNumberFromUser(scanner, "Enter the third number: ");

        double average = calculateAverage(number1, number2, number3);

        System.out.println("Calculating...");
        waitFor(4000);

        System.out.println("The average is: " + formatAverage(average));

        scanner.close();
    }


    private static double getNumberFromUser(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    private static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    private static void waitFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static String formatAverage(double average) {
        return String.format("%.2f", average);
    }
}

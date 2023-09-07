// Código com má prática

import java.util.Locale;
import java.util.Scanner;

public class AverageCalcBP {
    public static void main(String[] args) {
        Locale usLocale = new Locale("en", "US");
        Scanner calcAvarage = new Scanner(System.in).useLocale(usLocale);
        System.out.println("Avarage Calculator");
        System.out.println(" ");

        System.out.println("type any number: ");
        double number1 = calcAvarage.nextDouble();
        
        System.out.println("  ");
        System.out.println("type any number: ");
        double number2 = calcAvarage.nextDouble();

        System.out.println("  ");
        System.out.println("type any number: ");
        double number3 = calcAvarage.nextDouble();

        double average = (number1 + number2 + number3) / 3;
        
        System.out.println("  ");
        System.out.println("Wait just a moment...");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The average is: ");
        String formatAverage = String.format("%.2f", average);
        System.out.println(formatAverage);

        calcAvarage.close();
    }
}

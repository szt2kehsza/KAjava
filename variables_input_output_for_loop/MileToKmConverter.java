import java.util.Locale;
import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double miles;
        double kmtomiles = 1.60;

        System.out.print("Please enter a distance in miles: ");
        miles = sc.nextDouble();

        double km = miles * kmtomiles;
        String KM = String.format("%.2f", km).replace(",", ".");

        System.out.println("The distance in km: " + KM);


    }
}
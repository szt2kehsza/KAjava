import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);

        int chickens;
        int pigs;

        System.out.print("Please enter the number of chickens: ");
        chickens = sc.nextInt();

        System.out.print("Please enter the number of pigs: ");
        pigs = sc.nextInt();

        System.out.print("The number of legs: ");
        System.out.println((chickens*2)+(pigs*4));



    }
}

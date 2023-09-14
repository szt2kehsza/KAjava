import java.util.Scanner;

public class DrawDiamond {

    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);

        int height;
        System.out.print("Please enter the diamond height: ");
        height=sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = height - 1; i >= 1; i--) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}

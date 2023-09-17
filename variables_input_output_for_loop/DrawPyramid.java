import java.util.Scanner;

public class DrawPyramid {
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

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

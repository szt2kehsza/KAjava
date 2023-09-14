import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        Scanner sc;

        sc = new Scanner(System.in);

        int height;
        System.out.print("Please enter the triangle height: ");
        height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

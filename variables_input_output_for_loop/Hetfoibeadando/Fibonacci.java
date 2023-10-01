package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Adja meg, hogy hanyadik Fibonacci számot adjam vissza: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Nem adhat meg negatív számot!");
        }else{
            for (int i = 1; i <= n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
            System.out.println("\nRekurzív módszerrel számítva:");
            for (int i = 1; i <= n; i++) {
                System.out.print(fibonacciRec(i) + " ");
            }
        }
    }
    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2 || n == 3) {
            return 1;
        } else {
            int a = 0, b = 1, c = 0;
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }

    public static int fibonacciRec(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacciRec(n - 1) + fibonacciRec(n - 2);
        }
    }


}

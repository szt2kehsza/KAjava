package Hetfoibeadando;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Adja meg, hogy melyik számnak adjam vissza a számjegyei összegét?:");
        int n = sc.nextInt();

        if (n <= 0){
            System.out.println("Nem adhat meg negatív számot!");
        }else{
            System.out.println(sumDigitsRec(n));
        }
    }

    public static int sumDigitsRec(int n){
        if (n == 1){
            return 1;
        }else{
            return n + sumDigitsRec(n-1);
        }
    }

}
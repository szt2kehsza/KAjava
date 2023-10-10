package Hetfoibeadando;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Adja meg, hogy melyik számnak a faktoriálisait adjam vissza?:  ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Nem adhat meg negatív számot!");
        }else{
            System.out.println(num + "! = " + factorial(num));
            System.out.println("\nRekurzív módszerrel számítva:");
            System.out.println(num + "! = " + factorialRec(num));

        }
    }

    public static int factorial(int num){
        int result = 1;
        for (int i = 1; i<=num;i++){
            result*=i;
        }
        return result;
    }

    public static int factorialRec(int num){
        if (num == 0) {
            return 1;
        } else {
            return num * factorialRec(num - 1);
        }
    }




}
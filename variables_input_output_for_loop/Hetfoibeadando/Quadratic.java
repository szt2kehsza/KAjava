package Hetfoibeadando;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("f(x) = a  x^2 + b  x + c ");
        System.out.print("Adja meg az 'a'-t:");
        double a = sc.nextDouble();
        System.out.print("Adja meg az 'b'-t:");
        double b = sc.nextDouble();
        System.out.print("Adja meg az 'c'-t:");
        double c = sc.nextDouble();

        if (a<=0 || b<=0 ||c<=0){
            System.out.println("Nem adhat meg negatív számot!");
        }else{
            auadraticRec(a, b, c);
        }

    }

    public static void auadraticRec(double a, double b, double c){
        if (a == 0){
            System.out.println("A 'a' együttható nem lehet nulla, mert ez nem másodfokú egyenlet.");
        }else{
            double gyokalatt = Math.pow(b,2) - 4*a*c;

            if (gyokalatt > 0){
                double x1 = (-b + Math.sqrt(gyokalatt)) / (2 * a);
                double x2 = (-b - Math.sqrt(gyokalatt)) / (2 * a);
                System.out.println("Két zérushelye van:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (gyokalatt == 0) {
                double x = -b / (2*a);
                System.out.println("Egy zérushelye van:");
                System.out.println("x = " + x);
            }else{
                System.out.println("Nincsen zérushelye");
            }
        }
    }

}

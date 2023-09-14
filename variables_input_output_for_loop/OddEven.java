import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even
        //
        // Please enter a number: 7
        // Odd

        Scanner sc;

        sc = new Scanner(System.in);

        int num1;

        System.out.print("Please enter a number: ");
        num1 = sc.nextInt();

        if(num1%2==0){
            System.out.print("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
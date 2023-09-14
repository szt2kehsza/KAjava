import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner sc;

        sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Please enter the first number: ");
        num1 = sc.nextInt();
        System.out.print("Please enter the second number: ");
        num2 = sc.nextInt();
        if (num1>num2){
            System.out.println("The second number should be bigger");
        }

        for (int i = num1; i<num2;i++){
            System.out.println(i);
        }

    }
}

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);
        int num;

        System.out.print("Please enter a number: ");
        num = sc.nextInt();

        System.out.println("The number "+num+" should print:");
        for (int i=1; i<=10;i++){

            System.out.println(i+" * "+num+" = "+ (i*num));
        }

    }
}

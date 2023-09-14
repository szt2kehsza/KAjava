import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Please enter a number: ");
        num1 = sc.nextInt();

        System.out.print("Please enter a number: ");
        num2 = sc.nextInt();

        if(num1>num2){
            System.out.print(num1);
        }else{
            System.out.println(num2);
        }


    }
}

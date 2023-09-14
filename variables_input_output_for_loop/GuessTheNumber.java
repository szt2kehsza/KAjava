import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);

        int secretnumber = 16;
        int guessnumber = 0;

        while(secretnumber != guessnumber){
            System.out.print("Please enter your guess: ");
            guessnumber = sc.nextInt();
            if (secretnumber>guessnumber){
                System.out.println("The stored number is greater than "+guessnumber);
            }else if (secretnumber==guessnumber) {
                System.out.println("You have found the stored number "+guessnumber);
            }else{
                System.out.println("The stored number is smaller than "+guessnumber);
            }

        }



    }
}

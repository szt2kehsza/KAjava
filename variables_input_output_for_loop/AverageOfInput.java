
import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        Scanner sc;

        sc = new Scanner(System.in);
        int sum = 0;

        int [] tomb = new int[5];
        
        for (int i = 0; i<tomb.length; i++){
            System.out.print("Please enter a number: ");
            tomb[i] = sc.nextInt();
            sum += tomb[i];
        }

        double avg = (double) sum/tomb.length;

        System.out.print("Sum: "+sum+", Average: "+avg);


    }
}

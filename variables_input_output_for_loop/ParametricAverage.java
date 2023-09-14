import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        int lines;
        int sum = 0;

        System.out.print("How many numbers would you like to enter: ");
        lines = sc.nextInt();

        for (int i=1; i<lines+1;i++){
            System.out.print("Enter number "+i+" of "+lines+": ");
            sum += sc.nextInt();
        }
        System.out.println("Sum: "+sum+", Average: "+(double)sum/lines);


    }
}

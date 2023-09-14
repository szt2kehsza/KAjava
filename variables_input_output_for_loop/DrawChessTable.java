import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);

        int num;
        System.out.print("Please enter the chess table size: ");
        num = sc.nextInt();

        for (int i = 0; i<num;i++){
            if (i%2==1){
                System.out.println("  % % % %");
            }
            else{
                System.out.println(" % % % %");
            }
        }

    }

}

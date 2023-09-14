import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);

        int num;
        System.out.println("Please enter the square size: ");
        num=sc.nextInt();

        for (int i = 0; i<num;i++){
            if (i==0 || i == num){
                System.out.println("%%%%%%");
            }
            //hianyos
        }

    }
}

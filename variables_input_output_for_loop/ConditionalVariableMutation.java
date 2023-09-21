import java.util.Scanner;

public class ConditionalVariableMutation {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        // 1.
        int output1 = 0;
        System.out.print("Please enter an integer: ");
        int a = sc.nextInt();
        if (a%2==0){
            a++;
            output1 = a;
        }else{
            output1 = a;
        }
        System.out.println("output1: "+output1);
        //2.

        System.out.print("Please enter an integer between 0 and 30: ");
        int b = sc.nextInt();
        String output2 = "";
        if (b>=10 && b<= 20){
            output2 = "Sweet!";
        } else if (b<10) {
            output2 = "Less!";
        } else if (b>20) {
            output2 = "More!";
        }
        System.out.println("output2: "+output2);

        //3.
        System.out.print("Please enter an integer between 0 and 100: ");
        int credits = sc.nextInt();
        System.out.print("lease enter a boolean (true/false): ");
        boolean idBonus = sc.nextBoolean();
        int output3 = 0;
        if (credits>50 ||idBonus == false){
            output3 = credits-2;
        } else if (credits<50 || idBonus == false) {
            output3 = credits-1;
        } else if (idBonus == true) {
            output3 = credits;
        }
        System.out.println("output3: "+ output3);

        //4.

        System.out.print("Please enter an integer between 0 and 50: ");
        int d = sc.nextInt();
        System.out.print("Please enter an integer between 0 and 500: ");
        int time = sc.nextInt();
        String output4 = "";
        
        if (d%4==0 && time < 200){
            output4 = "Check";
        } else if (time > 200) {
            output4 = "Time out";
        } else{
            output4 = "Run Forest Run!";
        }
        System.out.println("output4: "+ output4);
    }
}

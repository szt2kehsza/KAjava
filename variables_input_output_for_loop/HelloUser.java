import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {

        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        //
        // Example:
        //
        // Please enter your name: John Doe
        // Hello, John Doe!
        //

        Scanner sc;
        sc = new Scanner(System.in);

        String name = "World";
        System.out.print("Please enter your name: ");
        name = sc.nextLine();
        System.out.printf("Hello, %s!", name);

    }
}

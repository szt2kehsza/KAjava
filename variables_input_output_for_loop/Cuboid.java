import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {

        double side1 = 10.4;
        double side2 = 13.5;
        double side3 = 8.2;

        double Volume = side1*side2*side3;
        double Area = 2*(side1*side2+side2*side3+side3*side1) ;

        System.out.println("Surface Area: "+Area);
        System.out.println("Volume: "+Volume);

    }
}

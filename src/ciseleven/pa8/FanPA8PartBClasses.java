package ciseleven.pa8;
/*
 * Name: Marcus Fan
 * Date: November 3, 2021
 * Assignment Name: PA8 PartB
 * Description: Uses the Circle method to return certain values based on user input
 * Inputs: radius
 * Outputs: depends: area, diameter, circumference, and radius
 */
import java.util.Scanner;

public class FanPA8PartBClasses {

    static Scanner s = new Scanner(System.in);
    static int ans1;
    static boolean cont = true;

    public static void main(String[] args) {
        System.out.println("Please input a radius for a circle");
        double thisRadius = s.nextDouble();
        Circle circl = new Circle(thisRadius);
        while (cont == true) {

            Options(circl);

        }

    }

    public static void Options(Circle c) {
        System.out.println("Please pick one of these options");
        System.out.println("1. Area\n2. Diameter\n3. Circumference\n4. SetArea");
        int ans = s.nextInt();

        switch(ans) {
            case 1:
                System.out.println("~" + Math.round(c.area()));
                break;
            case 2:
                System.out.println("~" + Math.round(c.diameter()));
                break;
            case 3:
                System.out.println("~" + Math.round(c.circumference()));
                break;
            case 4:
                System.out.println("Please input another radius");
                c.setRadius(s.nextDouble());
                System.out.println("Your new radius is " + Math.round(c.radius));
                break;
        }

        System.out.println("Would you like to choose another option?");
        System.out.println("1. Yes\n2. No");
        ans1 = s.nextInt();

        if (ans1 == 1) {
            cont = true;
        }else if (ans1 == 2) {
            System.out.println("Thank you for using this service!");
            cont = false;
        }else {
            System.exit(100);
        }

    }

}

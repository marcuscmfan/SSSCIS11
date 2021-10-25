package ciseleven.pa4;

import java.util.Scanner;

/*
 * Name: Marcus
 * Date: 08/10/21
 * Assignment Name: Radius of Circle PA4 (Part A)
 * Description: Prompts user if they want to calculate the area or radius of a
 * circle and prints out their answer based on the calculations in the methods
 */
public class FanRadiusOfCircle {

    private static double area;
    private static double radius;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Would you like to calculate the");
        System.out.println("1: Area");
        System.out.println("or");
        System.out.println("2: Radius");
        System.out.println("(Please type 1 or 2)");
        //Using try and catch statements because I need practice with them
        //And used a switch to give the user more functionality
        switch (s.nextInt()) {
            case 1:
                System.out.println("What is the radius? _");
                try {
                    getArea(s.nextDouble());
                    System.out.println("The area is " + area);
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case 2:
                System.out.println("What is the area? _");
                try {
                    getRadius(s.nextDouble());
                    System.out.println("The radius is " + radius);
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
        }

    }

    public static double getArea(double r) {
        area = Math.PI*(Math.pow(r, 2));
        //I used a return statement because if I need to use it in the future, I can manipulate it easily
        return area;
    }

    public static double getRadius(double area) {
        radius = Math.sqrt(area/Math.PI);
        //I used a return statement because if I need to use it in the future, I can manipulate it easily
        return radius;
    }
}

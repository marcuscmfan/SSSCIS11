package ciseleven.pa5;

/*
 * Name: Marcus Fan
 * Date: 18/10/21
 * Assignment Name: PA5 Part C
 * Description: It takes in someones first and last name then puts them together
 */

import java.io.IOException;
import java.util.Scanner;

public class FanFullName {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = s.nextLine();
        System.out.println(firstName + ", what is your last name?");
        String secondName = s.nextLine();

        System.out.println("Hello! " + firstName + " " + secondName);
    }
}

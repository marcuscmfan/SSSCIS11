package ciseleven.pa5;

/*
 * Name: Marcus Fan
 * Date: 18/10/21
 * Assignment Name: PA5 PartB
 * Description: Asks the user for a name and a number then proceeds to ask the user whether they want to use another number and based on that finishes or restarts
 */

import java.util.Scanner;

public class FanOddEven {

    static int num;
    static String name;
    static Scanner s = new Scanner(System.in);
    static boolean isON = true;

    public static void main(String[] args) {

        System.out.println("What is your name?");
        name = s.nextLine();



        while(!(isON == false)) {
            System.out.println(name + ", please input a number.");
            oddOrEven(s.nextDouble());
        }




    }

    public static void oddOrEven(double numba) {
        double num = numba % 2;
        if (num == 1) {
            System.out.println(name + ", " + numba + " is an odd number");
        }else if(num == 0) {
            System.out.println(name + ", " + numba + " is an even number");
        }
        System.out.println("Do you want to input another number? [Yes : 1/No : 0]");
        int answer = s.nextInt();
        if (answer == 1) {
            isON = true;
        } else if(answer == 0) {
            isON = false;
        }



    }
}

package ciseleven.pa4;

import java.util.Scanner;

/*
 * Name: Marcus
 * Date: 13/10/21
 * Assignment Name: PA4 Part C
 * Description: Adds interest to bank account using the amount of days and amount of money inputted to system
 */
public class FanSolveNewWordProblem {
    static double amountInBank;
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        calculateInterest(s.nextInt(), s.nextDouble());
        System.out.println(amountInBank);


    }

    public static double calculateInterest(int d, double P) {
        amountInBank = P*(1+0.09d/365);
       return amountInBank;
    }
}

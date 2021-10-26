package ciseleven.pa6;
/*
 * Name: Marcus
 * Date: 10/26/21
 * Assignment Name: PA6 Part B SwitchIf
 * Description: Calculates the weight of a person on different planets
 * Inputs: Name, and weight
 * Outputs: Questions and weight on the selected planet
 */
import java.util.Scanner;

public class FanSwitch {

    private static Scanner s = new Scanner(System.in);
    private static double Voltar = 0.091;
    private static double Krypton = 0.720;
    private static double Fertos = 0.875;
    private static double Servotos = 1.225;

    public static void main(String[] args) {
        System.out.println("What is your name");

        String name = s.nextLine();

        System.out.println(name + ", what is your weight right now?");

        double weight = s.nextDouble();

        System.out.println("What planet do you want to know your weight on? (Please select a number)");

        System.out.printf("%s \n%s \n%s \n%s", "1. Voltar", "2. Krypton", "3. Fertos", "4. Servotos");

        int ans = s.nextInt();

        switch(ans) {
            case 1:
                System.out.println("You weigh " + weight*Voltar + " on Voltar.");
                break;
            case 2:
                System.out.println("You weigh " + weight*Krypton + " on Krypton.");
                break;
            case 3:
                System.out.println("You weigh " + weight*Fertos + " on Fertos.");
                break;
            case 4:
                System.out.println("You weigh " + weight*Servotos + " on Servotos.");
                break;
        }
    }
}

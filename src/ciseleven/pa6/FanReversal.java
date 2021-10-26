package ciseleven.pa6;
/*
 * Name: Marcus Fan
 * Date: 10/26/21
 * Assignment Name: For Loop - PA6 PartC
 * Description: Reverses a name
 * Inputs: A name
 * Outputs: the reverse of the name
 */
import java.util.Scanner;

public class FanReversal {
    public static void main(String[] args) {
        //Scanner
        Scanner s = new Scanner(System.in);
        System.out.println("Please write your name (with a space in between the first and last)\n" + "Example : Marcus Fan\n" + "_");
        String name = s.nextLine();
        //character
        char charOfName;
        //reverse name var
        String nameReverse = "";
        for (int i = 0; i < name.length(); i++) {
            charOfName = name.charAt(i);
            nameReverse = charOfName+nameReverse;
        }

        System.out.println("The reverse of " + name + " is " + nameReverse.toLowerCase());
    }
}

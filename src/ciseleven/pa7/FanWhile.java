package ciseleven.pa7;
/*
 * Name: Marcus Fan
 * Date: Oct 28, 2021
 * Assignment Name: PA7 Part B
 * Description: Prints multiple statements using math utilities and String arrays
 * Inputs: Nothing
 * Outputs: Numbers
 */
import java.util.Random;

public class FanWhile {
    //Variable
    static int a = 1;
    static int b = 18;
    static int c = 0;
    public static void main(String[] args) {
        System.out.println("Numbers squared");

        while(a<6){
            System.out.println(a + " " + (int) Math.pow(a,2));
            a++;
        }

        System.out.println("Even number");

        while(b>-20) {
            if(b%2 == 0){
                System.out.println(b);

            }
            b--;
        }

        System.out.println("Creative");

        while(c < 101){
            System.out.println(c);
            c++;
        }
    }

}

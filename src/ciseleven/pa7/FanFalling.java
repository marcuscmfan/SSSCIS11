package ciseleven.pa7;
/*
 * Name: Marcus Fan
 * Date: Oct 28,2021
 * Assignment Name: PA7 Part C
 * Description: Prints the height calculations
 * Inputs: Height and interval in seconds
 * Outputs: Seconds and height at those seconds
 */
import java.util.Scanner;

public class FanFalling {
    static double gravity = 9.80665;
    static double twrheight = 10000;
    public static void main(String[] args) {
        //Scanner
        Scanner s = new Scanner(System.in);
        //Variables
        double height = s.nextDouble();
        double seconds = s.nextDouble();
        int b = 1;
        System.out.println("Time    Height");

        while(twrheight > 0) {
            heightCalculations(height, b);
            double twrheightRoundedDecimals = Math.round(twrheight*100);
            twrheightRoundedDecimals/=100;
            if(twrheightRoundedDecimals > 0) {
                System.out.println(b + "    " + twrheightRoundedDecimals);
            }else{
                System.out.println("Splat!");
                break;
            }
            b+=seconds;
        }

    }
    public static double heightCalculations(double height, double time) {
        twrheight = (height - (0.5 * gravity*Math.pow(time, 2)));
        return twrheight;
    }
}

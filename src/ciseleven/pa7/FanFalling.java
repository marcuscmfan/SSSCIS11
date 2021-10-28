package ciseleven.pa7;

import java.util.Scanner;

public class FanFalling {
    static double gravity = 9.80665;
    static double twrheight;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double height = s.nextDouble();
        double seconds = s.nextDouble();
        double interval = s.nextDouble();
        int a = 0;
        int b = 0;
        System.out.println("Time    Height");

        while(b < seconds) {
            heightCalculations(height, seconds);
            System.out.println(twrheight);
            b++;
        }

    }
    public static double heightCalculations(double height, double interval) {
        twrheight = (height - 0.5 * gravity*Math.pow(interval, 2));
        return twrheight;
    }
}

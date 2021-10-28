package ciseleven.pa7;

import java.util.Random;

public class FanWhile {

    public static void main(String[] args) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F"};
        System.out.println("Numbers squared");
        int a = 1;
        while(a<6){
            System.out.println(a + " " + (int) Math.pow(a,2));
            a++;
        }
        System.out.println("Even number");
        int b = 18;
        while(b>-20) {
            if(b%2 == 0){
                System.out.println(b);

            }
            b--;
        }
        System.out.println("Creative");
        int c = 0;
        while(c < 101){
            System.out.println(c);
            c++;
        }
    }

}

package ciseleven.scannertut;

import java.util.Scanner;

public class ScannerTutorial {
    public static void main(String[] args) {
        /*
        Use
        Scanner <name for the scanner> = new Scanner(<where you want your input to be>);
         */
        Scanner s = new Scanner(System.in);

        /**
         * Scanners scan for many things the following are the different basic Scanner methods and
         * some examples.
         */

        //Scans for a the line returns a String
        s.nextLine();

        String stringNextLine = s.nextLine();
        System.out.println("You used s.nextLine() and it read " + stringNextLine);
        //Scans for Integer value
        s.nextInt();

        int intNextInt = s.nextInt();
        System.out.println("You used s.nextInt() and it read " + intNextInt + ", you can use anything to manipulate the variable like intNextLine + 1 = " +(intNextInt + 1));
        //Scans for Double value
        s.nextDouble();

        double doubleNextDouble = s.nextDouble();
        System.out.println("You used s.nextDouble() to find " + doubleNextDouble);
        //Scans for String until next break
        s.next();

        String stringNext = s.next();
        System.out.println("You used s.next to read your first word : " + stringNext + ", but if you wrote a sentence you would still only see the first word");

    }
}

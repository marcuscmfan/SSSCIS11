package ciseleven.pa1;

public class FanFormattingShapes {

    /*
     * Name: Marcus Fan
     * Date: Wed 29 September 2021
     * Assignment Name: PA1-PartB - Formatting Shapes
     * Description: Prints out shapes formed by the letters that spell them
     */

    /*
    I used methods because it is more organized
     */


    public static void main(String[] args) {
        parallelogram();
        trapezoid();
        rectangle();
        diamond();
    }

    public static void parallelogram() {
        System.out.println("PARALLELOG");
        System.out.println(" A        R");
        System.out.println("  R        A");
        System.out.println("   ALLELOGRAM");
    }

    public static void trapezoid() {
        System.out.println(" ");
        //Code above just puts a space because it bugged me that the letters were so close to each other
        System.out.println("  APEZO ");
        System.out.println(" R     I");
        System.out.println("TRAPEZOID");
    }

    public static void rectangle() {
        System.out.println(" ");
        //Code above just puts a space because it bugged me that the letters were so close to each other
        System.out.println("RECTANGLE");
        System.out.println("E       L");
        System.out.println("C       G");
        System.out.println("T       N");
        System.out.println("A       A");
        System.out.println("N       T");
        System.out.println("G       C");
        System.out.println("L       E");
        System.out.println("ELGNATCER");
    }

    public static void diamond() {
        System.out.println(" ");
        //Code above just puts a space because it bugged me that the letters were so close to each other
        System.out.println("   D   ");
        System.out.println("  III  ");
        System.out.println(" AAAAA ");
        System.out.println("MMMMMMM");
        System.out.println(" OOOOO ");
        System.out.println("  NNN  ");
        System.out.println("   D   ");
    }
}

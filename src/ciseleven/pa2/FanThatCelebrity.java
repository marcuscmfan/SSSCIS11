package ciseleven.pa2;

/*
 * Name: Marcus Fan
 * Date: 01/10/21
 * Assignment Name: NameThatCelebrity
 * Description: Prints some of the celebrity name letters
 */

public class FanThatCelebrity {
    public static void main(String[] args) {
       //Declarations
       String s1 = "Allan Alda";
       String s2 = "John Wayne";
       String s3 = "Gregory Peck";
       String s4 = "Mao Zedong";

       int num1 = 2;
       int num2 = 7;

       //Print
       System.out.println("Allan Alda>>>" + s1.substring(num1, num2));
       System.out.println("John Wayne>>>" + s2.substring(num1, num2));
       System.out.println("Mao Zedong>>>" + s4.substring(num1-1, num2-1));
       System.out.println("Gregory Peck>>>" + s3.substring(num1, num2+2));

    }

}

package ciseleven.pa10;

import java.util.Arrays;

/*
 * Name: Marcus Fan
 * Date: November 19, 2021
 * Assignment Name: Pa10
 * Description: manipulate array
 * Inputs: nothing
 * Outputs: sorted alphabet and sorted names alphabetically
 */

public class MFUsingArrays {
    public static void main(String[] args) {

        String at = "abcdefghijklmnopqrstuvwxyz";
        char[] ch = new char[26];
        for (int i = 0; i < at.length(); i++) {
            ch[i] = at.toUpperCase().charAt(i);
        }

        for (int i = 0; i < ch.length; i++) {
            if(ch[i] != ch[25]) {
                System.out.print(ch[i] + ", ");
            }else {
                System.out.print(ch[i]);
            }
        }

        System.out.println("\n\n\n\n\nBonus");

        String[] ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};

        Arrays.sort(ss);

        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }
}

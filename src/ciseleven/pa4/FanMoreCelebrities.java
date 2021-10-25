package ciseleven.pa4;

/*
 * Name: Marcus Fan
 * Date: 08/10/21
 * Assignment Name: MoreCelebs PA4 (Part B)
 * Description: receives a name input and prints out just a part of the name
 */

import java.util.Scanner;

public class FanMoreCelebrities {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String name = s.nextLine();

        System.out.println(name + ">>>" + name.substring(2, 7));
    }
}

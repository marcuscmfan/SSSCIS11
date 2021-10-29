package ciseleven.pa7;
/*
 * Name: Marcus Fan
 * Date: Oct 28,2021
 * Assignment Name: PA7 Part A
 * Description: Prints some cool things
 * Inputs: Name, Numbers for counting and answers
 * Outputs: Numbers and Strings
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class FanMoreFor {
    static Random r = new Random();
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        //ArrayList of Strings
        ArrayList arrayList = new ArrayList<String>();
        arrayList.add("Lithium is an element on the periodic table");
        arrayList.add("Marijuana is illegal in a lot of states");
        arrayList.add("Shoes are things you wear on your feet");
        arrayList.add("Music is something you listen to");
        arrayList.add("You have 5 senses");
        arrayList.add("The person who made this is skinny");

        System.out.println("Hello what is your name?");

        String name = s.nextLine();

        System.out.println(name + "\n" + "Do you like Counting?\n1) Yes\n2) No");

        int ans1 = s.nextInt();

        if (ans1 == 1) {
            System.out.println("Give me a whole number to count to");
            int ans2 = s.nextInt();
            System.out.println("What number should we start at?");
            int ans3 = s.nextInt();
            if(ans2 < 0) {
                for (int i = ans3; i > ans2-1; i--) {
                    System.out.println(i);
                }
            }
            for (int i = ans3; i < ans2+1; i++) {
                System.out.println(i);
            }

        }

        if(ans1 == 2){
            System.out.println("Here are some random facts :\n");
            for (int i = 0; i < 4; i++) {
                int random = r.nextInt(arrayList.size());
                System.out.println(arrayList.get(random));
                arrayList.remove(random);
            }
        }
    }
}

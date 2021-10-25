package ciseleven.pa6;
/*
 * Name: Marcus
 * Date: 21/10/21
 * Assignment Name: PA6 PartA abc
 * Description: Asks for person's name, then asks a science-related topic
 * this user can answer the question and if they get it wrong they get roasted
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FanScienceIf {

    static Random r = new Random();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = s.nextLine();
        System.out.println(name + ", what is the symbol for lithium on the periodic table?");
        String li = s.nextLine();
        ArrayList<String> correctAnswers = new ArrayList<>();
        correctAnswers.add("You are right!");
        correctAnswers.add("You are crazy!");
        ArrayList<String> wrongAnswers = new ArrayList<>();
        wrongAnswers.add("You are wrong, go die!");
        wrongAnswers.add("Are you DUMB!");
        wrongAnswers.add("Get some help!");
        //switch case instead of if but if you wanted to use it then

        if (li.equals("Li")){
            System.out.println("Good Job!");
        }else{
            System.out.println("Wrong!");
        }

//        switch(li){
//            case "Li":
//                int randomCorrectAnswer = r.nextInt(2);
//                System.out.println(correctAnswers.get(randomCorrectAnswer));
//                break;
//            case "li":
//                System.out.println("You are dumb!");
//                break;
//            default:
//                int randomIncorrectAnswer = r.nextInt(3);
//                System.out.println(wrongAnswers.get(randomIncorrectAnswer));
//                break;
//        }
    }
}

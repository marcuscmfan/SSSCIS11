package ciseleven.pa9;

import java.util.Scanner;

public class myGenesisG90Bonus {

    static Automobile myGenesis = new Automobile(9);
    static boolean continueyesno = true;
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {




        while (continueyesno == true) {
            System.out.println("What would you like to do to your car?");
            System.out.println("1) Fillup\n2) Fuel Report\n3) Take a trip");

            String anschar = s.nextLine();
            String ansString = "";
            for (int i = 0; i < anschar.length(); i++) {
                ansString = ansString + anschar.charAt(i);
            }
            switchCase(ansString);
        }


    }

    public static void switchCase(String ansString) {
        switch (ansString) {
            case "Fillup":
                //ask for input litres
                System.out.println("How many litres would you like to add?");
                double filllitres = s.nextDouble();

                //Fillup Tank
                myGenesis.fillUp(filllitres);
                if (myGenesis.reportFuel() != 0) {
                    System.out.println("You filled your tank with " + (int) filllitres + " litres.");
                    System.out.println("It is filled with " + (int) myGenesis.reportFuel() + " litres.");
                }

                System.out.println("Would you like to continue?\n\n[1] Yes\n[2] No");
                int ans = s.nextInt();
                if (ans != 1){
                    continueyesno = false;
                }
                break;
            case "Fuel Report":
                System.out.println("Your tank is filled with " + (int) myGenesis.reportFuel() + " litres");
                System.out.println("Would you like to continue?\n\n[1] Yes\n[2] No");
                ans = s.nextInt();
                if (ans != 1){
                    continueyesno = false;
                }
                break;
            case "Take a trip":
                System.out.println("How many kilometres have you traveled?");
                double travellength = s.nextDouble();
                myGenesis.takeTrip(travellength);
                System.out.println("Your tank is filled with " + (int) myGenesis.reportFuel() + " litres");
                System.out.println("Would you like to continue?\n\n[1] Yes\n[2] No");
                ans = s.nextInt();
                if (ans != 1){
                    continueyesno = false;
                }
                break;
            case "End":
                return;
            default:
                System.out.println("Please try again.");
                return;
        }
    }

}

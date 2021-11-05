package ciseleven.pa8;
/*
 * Name: Marcus Fan
 * Date: November 3, 2021
 * Assignment Name: PA8 Part A
 * Description: Calculates averages of grades based on satisfaction level
 * Inputs: Number of Grades and Percentages of Grades
 * Outputs: Averages of the three categories
 */
import java.util.ArrayList;
import java.util.Scanner;

public class FanGrades {
	
  	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<Double> grades = new ArrayList<>();
		
		System.out.println("How many grades would you like to input?");
		
		int amtgrades = s.nextInt();
		
		System.out.println("Please input your grades pressing return after each one");
		for (int i = 0; i < amtgrades; i++) {
			grades.add(s.nextDouble());
		}
		
		ArrayList<Double> high = new ArrayList<>();
		ArrayList<Double> average = new ArrayList<>();
		ArrayList<Double> low = new ArrayList<>();

		
		for (int i = 0; i < grades.size(); i++) {
			if (grades.get(i) >= 80 && grades.get(i) <= 100) {
				high.add(grades.get(i));
			}else if (grades.get(i) >= 60 && grades.get(i) < 80) {
				average.add(grades.get(i));
			}else {
				low.add(grades.get(i));
			}
		}
		System.out.println("The excelling average is " + calculateAverage(high) + "%");
		System.out.println("The satisfactory average is " + calculateAverage(average) + "%");
		System.out.println("The unsatisfactory average is " + calculateAverage(low) + "%");
	}

	
	public static double calculateAverage(ArrayList<Double> grades) {
		
		double average = 0;
		
		for (int i = 0; i < grades.size(); i++) {
			average += grades.get(i);
		}
		
		average/=grades.size();
		
    double avgrn = Math.round(average*10);

		return avgrn/10;
		
	}
}

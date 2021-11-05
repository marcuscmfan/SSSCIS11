package ciseleven.pa8;
/*
 * Class Name: Circle
 * Date Created: November 3, 2021
 * Author: Marcus Fan
 * Details: Has 4 methods and can be used when a class has called the class
 * Methods: area, diameter, circumference, setRadius
 * Static Variables: radius
 */
public class Circle {

	
	public static double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	public static double area() {
		double area;
		area = (Math.pow(radius, 2)*Math.PI);
		return area;
	}
	
	public static double circumference() {
		double circumference;
		double d = radius*2;
		circumference = (d*Math.PI);
		return circumference;
	}
	
	public static void setRadius(double rad) {
		radius = rad;
	}
	
	public static double diameter() {
		double diameter = radius*2;
		return diameter;
	}
	
}

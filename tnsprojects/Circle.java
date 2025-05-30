package myproject;

import java.util.Scanner;
import java.lang.Math;
public class Circle {
	private double radius;
	private String colour;
	
	    @Override
		public String toString() {
			return "Circle [radius=" + radius + ", colour=" + colour + ", getRadius()=" + getRadius() + ", getColour()="
					+ getColour() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
public Circle(double radius, String colour) {
	        this.radius = radius;
	        this.colour = colour;
	    }
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public void getInput() {
    Scanner scanner= new Scanner(System.in);
    System.out.print("Enter Radius: ");
    radius = scanner.nextDouble();
    scanner.nextLine(); // Consume newline
    System.out.print("Enter Colour: ");
    colour = scanner.nextLine();
}
public void calcArea() {
    double area = Math.PI * radius * radius;
    System.out.println("Circle Colour: " + colour);
    System.out.println("Circle Area: "+ area);
    }}


	
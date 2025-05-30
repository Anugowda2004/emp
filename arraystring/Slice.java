package arrays_strings;
import java.util.Scanner;

public class Slice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a string: ");
		String text = scanner.nextLine();
		System.out.println("Enter a start index: ");
		int start = scanner.nextInt();
		System.out.println("Enter a end index: ");
		int end = scanner.nextInt();

		//Validate and slice the string

		if(start >= 0 && end <= text.length() && start < end) {

		String slice = text.substring(start, end);

		System.out.println("Sliced String: " + slice);}
		else {

		System.out.println("Invalid indives!");

	}

}}

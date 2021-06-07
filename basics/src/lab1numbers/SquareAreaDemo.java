package lab1numbers;

import java.util.Scanner;

public class SquareAreaDemo {

	public static void main(String[] args) {
		System.out.println("Enter side of square");
		Scanner scanner=new Scanner(System.in);
		double side=scanner.nextDouble();
		double Area=side*side;
		System.out.println("The Area of a square is..."+ Area);
		

	}

}

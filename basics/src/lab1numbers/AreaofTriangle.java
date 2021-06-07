package lab1numbers;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the width ot the traiangle");
		double base=scanner.nextDouble();
		System.out.println("Enter the height ot the traiangle");
		double height=scanner.nextDouble();
		double area=(base*height)/2;
		System.out.println("Area of triangle is.."+area);

	}

}

package hit.day4;

import java.util.Scanner;

public class FourthDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value lesser than 10");
		int x=scan.nextInt();
		if(x>10) {
			System.out.println("you entered value "+x);
			System.out.println("you entered wrong value "+"your value "+x+"is not lesser than 10" );
		}
		else {
			System.out.println("congratz you entered corect value");
		}

	}

}

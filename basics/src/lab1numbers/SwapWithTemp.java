package lab1numbers;

public class SwapWithTemp {

	public static void main(String[] args) {
		int first=120,second=220;
		System.out.println("--Before Swaping--");
		System.out.println("The first value"+ first);
		System.out.println("The second value"+ second);
		
		int temporary = first;
		first = second;
		second = temporary;
		
		System.out.println("--After Swapping--");
		System.out.println("The first value"+ first);
		System.out.println("The second value"+ second);
	}

}

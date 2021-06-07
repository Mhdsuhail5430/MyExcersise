package lab1numbers;

public class SwanWithoutTemp {

	public static void main(String[] args) {
		int first =120,second=220;
		System.out.println("--Before Swapping--");
		System.out.println("value of first is.."+ first);
		System.out.println("value of second is.."+ second);
		
		first = first - second;
		second= first + second;
		first = first - second;
		
		System.out.println("--After Swapping--");
		System.out.println("value of first is.."+ first);
		System.out.println("value of second is.."+ second);
		

	}

}

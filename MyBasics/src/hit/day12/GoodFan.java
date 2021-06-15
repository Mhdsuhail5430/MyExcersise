package hit.day12;

public class GoodFan {
	public static void main(String[] args) {
		
		MyGoodFan btn=new MyGoodFan();
		On_Off onof=new On_Off();
		Speed1 sp1=new Speed1();
		Speed2 sp2=new Speed2();
		Speed3 sp3=new Speed3();
		
		
		btn.onof=sp2;
		//btn.onof=sp3;
		
	    btn.makebuttons();
	}

}
class MyGoodFan{
	Button onof;
	public void makebuttons() {
		System.out.println(onof);
	}
}
class Button{
	
}
class On_Off extends Button{
	
	
}
class Speed1 extends Button{
	
	
}
class Speed2 extends Button{
	
}
class Speed3 extends Button{
	
}


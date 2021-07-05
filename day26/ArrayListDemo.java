package hit.day26;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		//Arrays
		String s[]=new String[4];
		s[0]="hello";
		//s[1]=new stone() its getting error to adding other than string
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		//latest for loop
		for(String str:s) {
			System.out.println(str);
		}
		
		 List list=new ArrayList();
		
		list.add("hello world");
		list.add("hai");
		list.add(120);
		list.add(new Stone());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//new for loop
		for(Object o:list) {
			System.out.println(o);
		}
		//but collections provide more  methods to read
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//cursor crerated by iterator is forward only curson and its fail fast-once read it cannot be reused
		
		//list iterator has advantage of moving your cursor back and forth
		ListIterator listiter=list.listIterator();
		
		while(listiter.hasNext()) {
			System.out.println(listiter.previous());
		}
	}

}
class Stone{
	
}

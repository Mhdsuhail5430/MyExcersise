package hit.day26;

import java.util.StringTokenizer;

public class LinerDataStructorOneToMany {
  public static void main(String[] args) {
	  String str="java,jee,python";
	  
	  StringTokenizer st=new StringTokenizer(str,",");
	  
	  while(st.hasMoreTokens()) {
		  System.out.println(st.nextToken());
	  }
}
}
  
  

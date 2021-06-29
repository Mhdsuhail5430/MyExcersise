package hit.day22;

//Critical path - The maximum limit or time within which u need to complete the task
//Asynchronous work/ execution - you use threads (A layer of indirection)

public class ThreadDemo1 {
	public static void main(String[] args)throws Exception {
		//By default java runs main thread
		Thread t=Thread.currentThread();
		t.setName("this is my thread");
		t.setPriority(10);
		System.out.println("now thread will sleep for 5 seconds");
		met();
		System.out.println(t);//this will executed after the 5seconds..
		//for(int i=0;i<4;i++) {
		//	System.out.println(i);
			
		//}
     
	} 
	static void met()throws Exception{
		System.out.println("method called");
		Thread.sleep(5000);
	}

}

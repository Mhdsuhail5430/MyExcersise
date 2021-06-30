package hit.day23;

/*By Multithread we achive
 * PARALLEL PROCESSING ON DAAY22 PROGRAMS
 * 1.performance 2.Asyncronous programming-execution by using Threads paralelly
 * HOW TO CREATE THREADS ?
 * we create thread using Thread class and using Executor Framework
 * */

public class ThreadRevision {
	public ThreadRevision() {
		Thread t=new Thread(new ThreadJob());//Associating the job of child THread
		t.start();//To call run method-thats the job of child thread
				
		
	}
	
	public static void main(String[] args) {
	   new ThreadRevision();
	   //How to capture the main Thread
	   //All java program run in main thread by deafault
		Thread t=Thread.currentThread();
		System.out.println(t);
		//lazy for loop
		for(int i=0;i<5;i++) {
			try {
 				Thread.sleep(1000);
			}catch(Exception e) {}
			System.out.println(i);
		}
	}

}
class ThreadJob implements Runnable {//Runnable is a one of method to do ajob of Thread
	@Override
	public void run() {//job of a Child Thread
		System.out.println("child thread is excecuted");
		
	}
}

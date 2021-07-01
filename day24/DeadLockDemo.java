package hit.day24;

public class DeadLockDemo {
	public static void main(String[] args) {
	 Frog frog=new Frog();
	 Crane crane=new Crane();
	 new Thread
	 (new Runnable() {
		 @Override
		public void run() {
			// TODO Auto-generated method stub
			crane.eat(frog);
		}
	 }).start();
	 
	 new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			frog.escape(crane);
		}
	}).start();
	}

}
class Crane{
	 synchronized public void eat(Frog frog) {
		 System.out.println();//this make a small interruption and it will amke an deadlock
		frog.leaveCalledByCrane();
	}
	synchronized public void leaveCalledByFrog() {
		
	}
}
class Frog{
	synchronized public void escape(Crane crane) {
		crane.leaveCalledByFrog();
	}
	synchronized public void leaveCalledByCrane() {
		
	}
	
}
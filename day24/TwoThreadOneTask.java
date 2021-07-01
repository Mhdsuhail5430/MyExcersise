package hit.day24;



public class TwoThreadOneTask {
  public static void main(String[] args) {
	Canon bofors=new Canon();
	ShootingTAsk st=new ShootingTAsk(bofors);
	
	Thread naina=new Thread(st,"naina");
	Thread shabeer=new Thread(st,"shabeer");
	
	naina.start();
	shabeer.start();
}

}
class ShootingTAsk implements Runnable{
	Canon gun;
	/**
	 * @param gun
	 */
	public ShootingTAsk(Canon gun) {
		
		this.gun = gun;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		if(t.getName().equals("naina")) {
			gun.fill();
			for(int i=0;i<5;i++) {
				gun.fill();
			}
			
		}
		else if(t.getName().equals("shabeer")) {
			for(int i=0;i<5;i++) {
				gun.shoot();
		}
		}
		
	}
}

class Canon{
	boolean flag;
	synchronized public void fill() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(flag) {
		   try {wait();}catch(Exception e) {}
		}
		System.out.println(name+".... fills the gun");
		flag=true;
		notify();
	} 
	synchronized public void shoot() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(!flag) {
			try {wait();}catch(Exception e) {}
			
		}
		System.out.println(name+" shoots the gun...");
	    flag=false;
	    notify();
	
	}
	
}
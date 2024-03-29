package hit.day22;

public class ThreadDemo3 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("muhaimeen");
		System.out.println("reservation counter started working ..."+t.getName());
		
		ReservationCounter central=new ReservationCounter();
		Thread imran=new Thread(new BookingJob(central, 10000),"imran");
		Thread taqi=new Thread(new BookingJob(central, 500),"taqi");
		
		imran.start();//to call the run method we use .start();
		taqi.start();
		
	}

}
class BookingJob implements Runnable{
	ReservationCounter central;int amt;
	public BookingJob(ReservationCounter central,int amt) {
		this.central=central;
		this.amt=amt;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		central.bookTicket(amt);
		central.giveChange();
		
		
	}
}
class ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"has come to book the ticket..");
		System.out.println(name+"brought.."+amt);
		
		
	}
	public void giveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("change given to.."+name);
		System.out.println(name+"take.."+(amt-100));
		System.out.println(name);
	}
}
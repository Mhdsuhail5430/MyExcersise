package hit.day23;

public class TwoThreadDemo {
	public static void main(String[] args) {
		ReservationCounter central=new ReservationCounter();
		Thread taqi=new Thread(new TicketBooking(central, 1000),"taqi");
		Thread imran=new Thread(new TicketBooking(central, 5000),"imran");
		
		taqi.start();
		imran.start();
		
	}
	
}
class TicketBooking implements Runnable {
	ReservationCounter central;int amt;
	
	
	public TicketBooking(ReservationCounter central, int amt) {
		
		this.central = central;
		this.amt = amt;
	}

	@Override
	public void run() {
		synchronized (central) {
			
		}
		central.bookTicket(amt);
		central.getChange();
		
	}
		
	
}
class ReservationCounter {
	int amt;
	public void bookTicket(int amt) {
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Ticket booked by Mr..."+name);
		System.out.println("amount brought by.."+name+"is: "+amt);
        try {Thread.sleep(5000);} catch (Exception e) {}      		
	}
	public void getChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("change took by Mr..:"+name);
		System.out.println("chnage amount for.."+name+": is:"+(this.amt-100));
	}
	
	
}

	

	
	
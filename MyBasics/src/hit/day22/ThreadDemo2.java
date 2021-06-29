package hit.day22;

import java.util.Date;

public class ThreadDemo2 {
	public static void main(String[] args)throws Exception {
		VaccinationCenter vc=new VaccinationCenter();
		Thread t=Thread.currentThread();
		t.setName("sohaib");
		System.out.println(new Date());
		
		System.out.println(t.getName()+ "  before coming to calss ");
		Thread kala=new Thread(new JobToKala(vc),"kala");
		kala.start();
		//vc.getToken();//without doin the job by the same person we give the job to kala.start();
		                //so in output the class started before the token collected by kala
		System.out.println(t.getName()+ " started  class ..for 7-9 Golden batch.."+new Date());
	}

}
class JobToKala implements Runnable{
	
	VaccinationCenter vc;
		public JobToKala(VaccinationCenter vc) {
		
		this.vc = vc;
		
	}


		@Override
	public void run() {
		// TODO Auto-generated method stub
			System.out.println("job given to kala is executed from this method");
			try {
				vc.getToken();
			}catch(Exception e){
				e.printStackTrace();
				
			}
		
	}
}
class VaccinationCenter{
	
	public void getToken()throws Exception{
		Thread t=Thread.currentThread();
		
		String name=t.getName();
		
		
		System.out.println(name+"..standing in queue for token");
		Thread.sleep(5000);
		System.out.println("token received.."+new Date());
		
		
	}
	
}

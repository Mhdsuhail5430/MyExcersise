package hit.day21;

public class UniversalRemote {
	public static void main(String[] args) {
		System.out.println("Demonstarte of remote..");
		Tv tv=new Tv();
		SetTopBox settopbox=new SetTopBox();
		Netflix netflix=new Netflix();
		SoundSystem soundsystem= new SoundSystem();
		
		FathersNewsChannelCommand fncc=new FathersNewsChannelCommand(tv,settopbox ,netflix, soundsystem);
		MotherSeralCommand msc=new MotherSeralCommand(tv, settopbox, netflix, soundsystem);
		MotherOldMovieCommand momc=new MotherOldMovieCommand(tv, settopbox, netflix, soundsystem);
		
		Remote myremote=new Remote();
		System.out.println("before assingning numbers to remote.. it will be dummy");
		myremote.executeCommand(1);
		System.out.println("After assingning buttons to remote");
		myremote.setCommand(fncc, 0);
		myremote.setCommand(momc, 1);
		myremote.setCommand(msc, 2);
		
		System.out.println("my father wants to see new channel.");
		
		 myremote.executeCommand(0);
		
		
	}

}
class Tv{
	public void av1() {
		System.out.println("tv switch to av1 mode...");
	}
	public void switchOn() {
		System.out.println("tv switch on");
	}
}
class SetTopBox{
	public void newsChannel() {
		System.out.println("news channel");
	}
	public void serialChannel() {
		System.out.println("serial channel stsrted");
		
	}
	
}
class Netflix{
	public void movieOld(){
		System.out.println("old movie started");
	}
}
class SoundSystem{
	public void lowSound() {
		System.out.println("Sound volume decreased");
	}
}
interface Command{
	public void execute();
}
class FathersNewsChannelCommand implements Command{
	Tv tv;SetTopBox settopbox;SoundSystem soundsystem;Netflix netflix;
	 public FathersNewsChannelCommand(Tv tv,SetTopBox settopbox,Netflix netflix,SoundSystem soundsystem) {
		// TODO Auto-generated constructor stub
		 this.tv=tv;
		 this.settopbox=settopbox;
		 this.soundsystem=soundsystem;
		 this.netflix=netflix;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("father tv action started");
		tv.switchOn();
		tv.av1();
		settopbox.newsChannel();
		soundsystem.lowSound();
		System.out.println("dad enjoy your news channel...");
		
		
		
	}
}
class MotherOldMovieCommand implements Command{
	Tv tv;SetTopBox settopbox;SoundSystem soundsystem;Netflix netflix;
	 public MotherOldMovieCommand(Tv tv,SetTopBox settopbox,Netflix netflix,SoundSystem soundsystem) {
		// TODO Auto-generated constructor stub
		 this.tv=tv;
		 this.settopbox=settopbox;
		 this.soundsystem=soundsystem;
		 this.netflix=netflix;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("mother olod movie command started..");
		tv.switchOn();
		tv.av1();
		netflix.movieOld();
		System.out.println("enjoy the old movie");
		
	}
}
class MotherSeralCommand implements Command{
	Tv tv;SetTopBox settopbox;Netflix netflix;SoundSystem soundsystem;
	     /**
	 * @param tv
	 * @param settopbox
	 * @param netflix
	 * @param soundsystem
	 */
	public MotherSeralCommand(Tv tv, SetTopBox settopbox, Netflix netflix, SoundSystem soundsystem) {
		super();
		this.tv = tv;
		this.settopbox = settopbox;
		this.netflix = netflix;
		this.soundsystem = soundsystem;
	}




	//public MotherSeralCommand() {
		
		// TODO Auto-generated constructor stub
	//}

		

	@Override
	public void execute() {
		// TODO Auto-generated method stub
	System.out.println("mothedr old movie commmand satarted..");
	    tv.switchOn();
	    tv.av1();
	    netflix.movieOld();
	    System.out.println("enjoy the old movies..");
		
	}
}
class MotherSerialCommand implements Command{
	Tv tv;SetTopBox settopbox;Netflix netflix;SoundSystem soundsystem;

	/**
	 * @param tv
	 * @param settopbox
	 * @param netflix
	 * @param soundsystem
	 */
	public MotherSerialCommand(Tv tv, SetTopBox settopbox, Netflix netflix, SoundSystem soundsystem) {
		super();
		this.tv = tv;
		this.settopbox = settopbox;
		this.netflix = netflix;
		this.soundsystem = soundsystem;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.switchOn();
		tv.av1();
		settopbox.serialChannel();
		System.out.println("enjoy the serial mom..");
		
	}
}
class DummyCommand implements Command{
	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("im dummy button..");
		
		
	}
}
class Remote{
	Command command[]=new Command[5];
	public Remote() {
		for(int i=0;i<command.length;i++) {
			command[i]=new DummyCommand();
		}
	}
	public void setCommand(Command command,int slot) {
		this.command[slot]=command;
		
	}
	public void executeCommand(int slot) {
		command[slot].execute();
		
	}
}

public class Amplifier {
	private boolean turned;
	private DvdPlayer dvd = new DvdPlayer();
	private CdPlayer cd = new CdPlayer();
	
	public void on() {
		turned = true;
		System.out.println(turned);
	}
	
	public void off() {
		turned = false;
		dvd.off();
		cd.off();
		System.out.println(turned);
	}
	
	public void setCD() {
		cd.on();
		System.out.println("Setting the cd");
	}
	
	public void setDVD() {
		dvd.on();
		System.out.println("Setting the dvd");
	}
	
}

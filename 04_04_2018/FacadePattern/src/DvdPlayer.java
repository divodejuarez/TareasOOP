
public class DvdPlayer {
	private boolean turned;
	
	public void on() {
		turned = true;
		System.out.println(turned);
	}
	
	public void off() {
		turned = false;
		System.out.println(turned);
	}
	
	public void eject() {
		System.out.println("Ejecting the dvd");
	}
	
	public void play() {
		System.out.println("Playing the dvd");
	}
	
}


public class Projector {
	private boolean turned;
	private DvdPlayer dvd = new DvdPlayer();
	
	public void on() {
		turned = true;
		dvd.on();
		System.out.println(turned);
	}
	
	public void off() {
		turned = false;
		dvd.off();
		System.out.println(turned);
	}
	
	public void tvMode() {
		System.out.println("Changing to tv mode");
		dvd.on();
		dvd.play();
	}
	
	public void widescreen() {
		System.out.println("Widing the screen");
	}
}

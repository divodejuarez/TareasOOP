
public class FacadeTheater {
	private Amplifier amp;
	private CdPlayer cd;
	private Projector pro;
	private DvdPlayer dvd;
	
	public FacadeTheater() {
		amp = new Amplifier();
		cd = new CdPlayer();
		pro = new Projector();
		dvd = new DvdPlayer();
	}
	
	public void stopEverything() {
		amp.off();
		pro.off();
	}
	
	public void watchMovie() {
		pro.on();
		pro.tvMode();
		dvd.play();
	}
	
	public void surroundMusic() {
		amp.on();
		amp.setCD();
		cd.play();
	}
}

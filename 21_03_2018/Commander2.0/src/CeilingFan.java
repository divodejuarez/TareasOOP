
public class CeilingFan {
	public int state;
	
	public CeilingFan() {
		state = 0;
	}
	
	public void off() {
		state = 0;
		System.out.println("Fan is off");
	}
	
	public void slow() {
		state = 1;
		System.out.println("Fan on slow");
	}
	
	public void medium() {
		state = 2;
		System.out.println("Fan on medium");
	}
	
	public void high() {
		state = 3;
		System.out.println("Fan on high");
	}
	
	
}

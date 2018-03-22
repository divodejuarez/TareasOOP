
public class Door {
	private boolean on;
	
	public void openDoor() {
		on = true;
		System.out.println(on);
	}
	
	public void closeDoor() {
		on = false;
		System.out.println(on);
	}
}

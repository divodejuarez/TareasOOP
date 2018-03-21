
public class OpenDoor implements Command{
	
	Door door;
	
	public OpenDoor(Door door) {
		this.door = door;
	}
	
	public void execute() {
		door.openDoor();
	}

}


public class CloseDoor implements Command{
	
	Door door;
	
	public CloseDoor(Door door) {
		this.door = door;
	}
	
	public void execute() {
		door.closeDoor();
	}
}

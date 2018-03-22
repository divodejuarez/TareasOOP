
public class Client {
	public static void main(String[] args) {
		RemoteControl rm = new RemoteControl();
		
		Door door = new Door();
		Blender blender = new Blender();
		
		Command opendoor = new OpenDoor(door);
		Command closedoor = new CloseDoor(door);
		
		Command blending = new Blending(blender);
		Command crushing = new Crushing(blender);
		
		rm.setCommands();
		rm.pressButton(0);
		
		rm.undoButton();
	}
}

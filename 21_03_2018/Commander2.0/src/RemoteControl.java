import java.util.ArrayList;
import java.util.List;

//invoker
public class RemoteControl {
	Door door = new Door();
	Blender blender = new Blender();
	
	private List<Command> undos;
	private List<Command> commands = new ArrayList<>();
	
	public RemoteControl() {
		undos = new ArrayList<>();
	}
	
	public void setCommands() {
		commands.add(new OpenDoor(door));
		commands.add(new CloseDoor(door));
		commands.add(new Blending(blender));
		commands.add(new Crushing(blender));
	}
	
	public void pressButton(int c) {
		Command cmd;
		switch (c) {
		case 0:
			cmd = commands.get(c);
			undos.add(cmd);
			cmd.execute();
			break;
		case 1:
			cmd = commands.get(c);
			undos.add(cmd);
			cmd.execute();
			break;
		case 2:
			cmd = commands.get(c);
			undos.add(cmd);
			cmd.execute();
			break;
		case 3:
			cmd = commands.get(c);
			undos.add(cmd);
			cmd.execute();
			break;
		default:
			System.out.println("That button does not exists");
		}
	}
	
	public void undoButton() {
		if(!undos.isEmpty()) {
			Command cmd = undos.get(undos.size() - 1);
			undos.remove(cmd);
			cmd.undo();
		}
	}
}

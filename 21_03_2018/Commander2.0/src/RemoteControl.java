import java.util.ArrayList;
import java.util.List;

//invoker
public class RemoteControl {
	Door door = new Door();
	Blender blender = new Blender();
	CeilingFan cf = new CeilingFan();
	
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
		commands.add(new CeilingCommands(cf));
		commands.add(new CeilingCommands(cf));
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
		case 4:
			cmd = commands.get(c);
			undos.add(cmd);
			cmd.execute();
			break;
		case 5:
			cmd = commands.get(c);
			undos.add(cmd);
			cmd.undo();
			break;
		case 6:
			int[] arr = new int[3];
			arr[0] = 0;
			arr[1] = 2;
			arr[2] = 3;
			
			for(int i : arr) {
				cmd = commands.get(i);
				undos.add(cmd);
				cmd.execute();
			}
			break;
		default:
			System.out.println("That button does not exists");
			break;
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


public class Blending implements Command{

	Blender blender;
	
	public Blending(Blender blender) {
		this.blender = blender;
	}
	
	public void execute() {
		blender.blend();
	}

	@Override
	public void undo() {
		blender.crush();	
	}

}

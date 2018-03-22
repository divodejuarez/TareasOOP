
public class Crushing implements Command{

	Blender blender;
	
	public Crushing(Blender blender) {
		this.blender = blender;
	}
	
	
	public void execute() {
		blender.crush();
	}


	@Override
	public void undo() {
		blender.blend();
	}

}


public class Handicup extends Persona{
	
	public IMotriz mov;
	private String descripcion;
	
	public Handicup(IMotriz mov) {
		super(mov);
		this.mov = mov;
	}
	
	public void setDescricion(String descripcion){
		this.descripcion = descripcion;
	}
	
	public String getDescripcion(){
		return this.descripcion;
	}
	
}

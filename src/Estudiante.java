
public class Estudiante extends Persona{
	
	private IMotriz mov;
	int matricula;
	
	public Estudiante(IMotriz mov) {
		super(mov);
		this.mov = mov;
	}
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public int getMatricula(){
		return this.matricula;
	}
}


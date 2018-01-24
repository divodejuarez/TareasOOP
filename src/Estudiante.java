
public class Estudiante extends Persona{
	
	public IMotriz mov;
	int matricula;
	
	public Estudiante(IMotriz mov) {
		super(mov);
		this.mov = mov;
	}
	
	/*public Estudiante(IMotriz mov){
		this.mov = mov;
	}*/
	
	
	/*public String motrizManos(){
		return this.mov.motrizManos();
	}
	
	public String motrizPies(){
		return this.mov.motrizPies();
	}*/
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public int getMatricula(){
		return this.matricula;
	}
}


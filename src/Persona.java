
public abstract class Persona {
	private String nombre;
	private boolean genero;
	private int edad;
	
	private IMotriz mov;
	
	public Persona(IMotriz mov){
		this.mov = mov;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public void setEdad(int edad) {
		this.edad = edad;	
	}

	
	public void setGenero(boolean genero) {
		this.genero = genero;	
	}

	
	public String getNombre() {
		return this.nombre;
	}

	
	public int getEdad() {
		return this.edad;
	}

	
	public boolean getGenero() {
		return genero;
	}

	
	public String hablar(String verbo) {
		return verbo;
	}

	
	public void respirar() {
		System.out.println("Estoy respirando");
	}

	
	public void brincarSobreUnPie() {
		System.out.println("Estoy brincando");
	}

	public String motrizManos(){
		return this.mov.motrizManos();
	}
	
	public String motrizPies(){
		return this.mov.motrizPies();
	}
	
	public String motrizNulo(){
		return this.mov.motrizNulo();
	}
}

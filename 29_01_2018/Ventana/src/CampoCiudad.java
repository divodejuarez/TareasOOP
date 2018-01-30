
public class CampoCiudad extends Campo{
	
	public CampoCiudad(){
		setValidacion(new ValidacionStr());
	}
	
	@Override
	public void validar(String s){
		if(getValidacion().comprobar(s)){
			System.out.println("Campo validado");
		}
		else{
			System.out.println("Campo no validado");
		}
	}
	
}

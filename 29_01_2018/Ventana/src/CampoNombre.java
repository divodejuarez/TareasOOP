
public class CampoNombre extends Campo{
	
	public CampoNombre(){
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


public class CampoFecha extends Campo{
	
	public CampoFecha(){
		setValidacion(new ValidacionFecha());
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

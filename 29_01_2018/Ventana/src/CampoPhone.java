
public class CampoPhone extends Campo{
	
	public CampoPhone(){
		setValidacion(new ValidacionNum());
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

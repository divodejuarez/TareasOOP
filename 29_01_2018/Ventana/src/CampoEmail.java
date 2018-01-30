
public class CampoEmail extends Campo{
	
	public CampoEmail(){
		setValidacion(new ValidacionEmail());
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

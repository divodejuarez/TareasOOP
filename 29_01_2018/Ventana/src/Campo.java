
public abstract class Campo {
	private IValidacion v;
	
	public void setValidacion(IValidacion v){
		this.v = v;
	}
	
	public void validar(String s){
		
	}
	
	public IValidacion getValidacion(){
		return this.v;
	}
	
}

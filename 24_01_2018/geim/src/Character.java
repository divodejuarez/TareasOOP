
public abstract class Character {
	
	private String character;
	private IWeaponBehaviour wp;
	private String weapon;
	
	
	public void setWeapon(IWeaponBehaviour wp){
		this.wp = wp;
	}
	
	public void setCharacter(String character){
		this.character = character;
	}
	
	public String getCharacter(){
		return this.character;
	}	
	
	public void fight(){
		//this.wp.useWeapon();
	}
	
	public IWeaponBehaviour getWP(){
		return wp;
	}
	
}

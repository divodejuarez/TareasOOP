
public abstract class Character {
	
	private IWeaponBehaviour wp;
	
	
	public void setWeapon(IWeaponBehaviour wp){
		this.wp = wp;
	}
	
	public void fight(){
		//this.wp.useWeapon();
	}
	
	public IWeaponBehaviour getWP(){
		return wp;
	}
	
}


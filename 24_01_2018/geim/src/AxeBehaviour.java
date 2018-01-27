
public class AxeBehaviour implements IWeaponBehaviour{
	
	private final String weapon = "axe";
	
	@Override
	public String useWeapon() {
		return "an axe";
		
	}
	
	public String isWeapon(){
		return weapon;
	}
	
}

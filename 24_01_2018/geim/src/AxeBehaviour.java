
public class AxeBehaviour implements IWeaponBehaviour{
	
	private final String weapon = "axe";
	
	@Override
	public String useWeapon() {
		return "lift the axe";
		
	}
	
	public String isWeapon(){
		return weapon;
	}
	
}

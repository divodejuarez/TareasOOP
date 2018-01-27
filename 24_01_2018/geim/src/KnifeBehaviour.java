
public class KnifeBehaviour implements IWeaponBehaviour{
	
	private final String weapon = "knife";
	
	@Override
	public String useWeapon() {
		return "a knife";
		
	}
	
	public String isWeapon(){
		return weapon;
	}
	
}


public class SwordBehaviour implements IWeaponBehaviour{
	
	private final String weapon = "sword";
	
	@Override
	public String useWeapon() {
		return "swing the sword";
		
	}
	
	public String isWeapon(){
		return weapon;
	}

}

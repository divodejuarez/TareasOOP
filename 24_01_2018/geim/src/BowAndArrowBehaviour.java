
public class BowAndArrowBehaviour implements IWeaponBehaviour{
	
	final String weapon = "bow and arrow";
	
	@Override
	public String useWeapon() {
		return "a bow and arrow";
		
	}
	
	public String isWeapon(){
		return weapon;
	}

}
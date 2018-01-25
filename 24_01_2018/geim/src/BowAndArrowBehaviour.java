
public class BowAndArrowBehaviour implements IWeaponBehaviour{
	
	final String weapon = "bow and arrow";
	
	@Override
	public String useWeapon() {
		return "shoot arrow";
		
	}
	
	public String isWeapon(){
		return weapon;
	}

}

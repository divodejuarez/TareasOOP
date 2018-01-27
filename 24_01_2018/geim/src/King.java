
public class King extends Character{
	
	public King(){
		setWeapon(new SwordBehaviour());
	}
	
	@Override
	public void fight(){
		System.out.println("The King is about to attack with " + getWP().useWeapon());
	}
	
}

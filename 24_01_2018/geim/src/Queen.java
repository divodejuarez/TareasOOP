
public class Queen extends Character{
	
	public Queen(){
		setWeapon(new BowAndArrowBehaviour());
	}
	
	@Override
	public void fight(){
		System.out.println("The Queen is about to attack with " + getWP().useWeapon());
	}
	
}

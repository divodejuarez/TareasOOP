
public class Troll extends Character{
	
	public Troll(){
		setWeapon(new AxeBehaviour());
	}
	
	@Override
	public void fight(){
		System.out.println("The Troll is about to attack with " + getWP().useWeapon());
	}
}

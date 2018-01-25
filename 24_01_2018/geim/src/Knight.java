
public class Knight extends Character{
	
	public Knight(){
		setWeapon(new SwordBehaviour());
	}

	@Override
	public void fight(){
		System.out.println("The knight is about to " + getWP().useWeapon());
	}
}

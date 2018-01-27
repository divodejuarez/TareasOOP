
public class Demo {

	public static void main(String[] args) {
		Character knight = new Knight();
		
		knight.fight();
		knight.setWeapon(new BowAndArrowBehaviour());
		knight.fight();
		
		System.out.println();
		
		Character troll = new Troll();
		troll.fight();
		
		System.out.println();
		
		Character queen = new Queen();
		queen.fight();
		queen.setWeapon(new KnifeBehaviour());
		queen.fight();
		
		System.out.println();
		
		Character king = new King();
		king.fight();
		king.setWeapon(new KnifeBehaviour());
		king.fight();

	}

}


public class PizzaPlaya extends PizzaStore{
	
	private Pizza p;

	@Override
	Pizza createPizza(String pz) {
		switch(pz) {
		case "PEPPERONI":
			p = new PizzaA(pz);
			p.pz = "Adding more pepperonis";
			p.baking();
			p.cutting();
			p.boxing();
			return p;
		case "HAWAI":
			p = new PizzaA(pz);
			p.pz = "Adding more pinapple";
			p.baking();
			p.cutting();
			p.boxing();
			return p;
		default:
			return null;
		}
		
	}

}

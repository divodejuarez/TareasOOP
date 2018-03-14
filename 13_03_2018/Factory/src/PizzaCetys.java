
public class PizzaCetys extends PizzaStore{
	
	Pizza p;

	@Override
	Pizza createPizza(String pz) {
		switch(pz) {
		case "PEPPERONI":
			p = new PizzaA(pz);
			p.baking();
			p.pz = "Adding less pepperonis than playas";
			p.boxing();
			return p;
		case "HAWAI":
			p = new PizzaB(pz);
			p.baking();
			p.pz = "Adding less pinapples than playas";
			p.boxing();
			return p;
		default:
			return null;
		}
	}

}


public class PizzaPlaya extends PizzaStore{
	
	private Pizza p;

	@Override
	Pizza createPizza(String pz) {
		switch(pz) {
		case "PEPPERONI":
			p = new Cheese(new Pepperoni(new Meat(new BasicPizza())));
			return p;
		case "HAWAI":
			p = new Cheese(new Ham(new Pinapple(new Meat(new BasicPizza()))));
			return p;
		default:
			return null;
		}
		
	}

}

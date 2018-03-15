
public class PizzaCetys extends PizzaStore{
	
	Pizza p;

	@Override
	Pizza createPizza(String pz) {
		switch(pz) {
		case "PEPPERONI":
			p = new Cheese(new Pepperoni(new BasicPizza()));
			return p;
		case "HAWAI":
			p = new Cheese(new Ham(new Pinapple(new BasicPizza())));
			return p;
		default:
			return null;
		}
	}

}

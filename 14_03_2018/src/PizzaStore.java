
public abstract class PizzaStore {
	Pizza orderPizza(String pz) {
		return createPizza(pz);
	}
	
	String getDescPizza(Pizza p) {
		return p.desc;
	}
	
	abstract Pizza createPizza(String pz);
}

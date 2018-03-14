
public abstract class PizzaStore {
	Pizza orderPizza(String pz) {
		return createPizza(pz);
	}
	abstract Pizza createPizza(String pz);
}

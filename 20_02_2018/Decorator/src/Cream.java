
public class Cream extends IngredientDecorator{

	public Cream(Component component) {
		super(component);
		//this.component = component;
	}
	
	public String getDescription() {
		return component.getDescripcion() + ", Cream";
	}

	public double cost() {
		return component.cost() + 9;
	}

}

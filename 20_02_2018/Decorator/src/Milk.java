
public class Milk extends IngredientDecorator{
	
	public Milk(Component component) {
		super(component);
		//this.component = component;
	}
	
	public String getDescription() {
		return component.getDescripcion() + ", Milk";
	}

	public double cost() {
		return component.cost() + 7;
	}

}


public class Soy extends IngredientDecorator{
	
	public Soy(Component component) {
		super(component);
		//this.component = component;
	}
	
	public String getDescription() {
		return component.getDescripcion() + ", Soy";
	}

	public double cost() {
		return component.cost() + 5;
	}

}

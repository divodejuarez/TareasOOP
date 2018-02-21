
public class IngredientDecorator extends Component{
	
	public Component component;
	
	public IngredientDecorator(Component component) {
		this.component = component;
	}
	
	public String getDescription() {
		return this.component.getDescripcion();
	}
	
	public Size getSize() {
		return component.size;
	}

	public double cost() {
		return this.component.cost();
	}
	
}

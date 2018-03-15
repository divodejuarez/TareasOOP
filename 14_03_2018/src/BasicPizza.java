
public class BasicPizza extends Pizza{
	
	public BasicPizza() {
		this.desc = "A pizza.";
	}
	
	@Override
	public void bake() {
		System.out.println("Baking the pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza");
		
	}

	@Override
	public void box() {
		System.out.println("Boxing the pizza");
	}

}

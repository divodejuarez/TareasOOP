
public abstract class PizzaDeco extends Pizza{
	
	Pizza p;
	
	public PizzaDeco(Pizza p) {
		this.p = p;
	}
	
	@Override
	public void bake() {
		this.p.bake();
	}

	@Override
	public void cut() {
		this.p.cut();
	}

	@Override
	public void box() {
		this.p.box();
	}

}


public abstract class Pizza {
	String pz;
	private String dec;
	
	public Pizza(String dec) {
		this.dec = dec;
		System.out.println("I am of type " + dec);
	}
	
	void baking() {
		System.out.println("Baking the pizza");
	}
	void cutting() {
		System.out.println("Cutting the pizza");
	}
	void boxing() {
		System.out.println("Boxing the pizza");
	}
}

//import Component.Size;

public class Demo {

	public static void main(String[] args) {
	
		Component beverage = new Milk(new Mocha());
		//beverage = new Milk(beverage);
		//beverage = new Cream(beverage);
		//beverage.setSize(Size.GRANDE);
		
		System.out.println(beverage.getDescripcion() + " $" + beverage.cost());
		
	}

}

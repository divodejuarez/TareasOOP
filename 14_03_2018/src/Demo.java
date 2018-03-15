
public class Demo {
	public static void main(String[] args) {
		PizzaStore cetys = new PizzaCetys();
		
		Pizza p;
		
		p = cetys.orderPizza("PEPPERONI");
		System.out.println(cetys.getDescPizza(p));
		
		
		/*String a = "a";
		
		System.out.println(a + " b");*/
	}
}

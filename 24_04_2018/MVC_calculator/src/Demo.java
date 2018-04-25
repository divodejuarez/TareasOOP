
public class Demo {

	public static void main(String[] args) {
		CalcController c = new CalcController("+", 1, 2);
		
		System.out.println(c.returnResult());
		c.setOperation("-");
		System.out.println(c.returnResult());
		c.saveLastOp();
		System.out.println(c.returnResult());
		c.setOperation("*");
		c.setNumbers(1, 5);
		System.out.println(c.returnResult());
		c.saveLastOp();
		System.out.println(c.returnResult());
		
		new SwingTest();
	}
}

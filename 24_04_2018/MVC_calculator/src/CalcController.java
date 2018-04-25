
public class CalcController {
	private int a, b, ans;
	private String op;
	private boolean saveLast = false;
	
	//WHEN AN OPERATION INITIATES, THIS CONSTRUCTOR RUNS
	public CalcController(String op, int a, int b) {
		this.op = op;
		this.a = a;
		this.b = b;
		this.ans = 0;
	}
	
	//FOR LAST RESULT OF LAST OPERATION
	public void saveLastOp() {
		saveLast = !saveLast;
	}
	
	//OPERATION TO DO
	public void setOperation(String op) {
		this.op = op;
	}
	
	//SET NEW NUMBERS
	public void setNumbers(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//OPERATIONS
	private int sum(int a, int b) {
		if(this.saveLast) {
			ans = a + b;
			return ans;
		}
		return a + b;
	}
	
	private int minus(int a, int b) {
		if(this.saveLast) {
			ans = a - b;
			return ans;
		}
		return a - b;
	}
	
	private int divide(int a, int b) {
		try {
			if(this.saveLast) {
				ans = a / b;
				return ans;
			}
			return a / b;
		}catch(Exception e) {
			return 0;
		}
	}
	
	private int multiply(int a, int b) {
		if(this.saveLast) {
			ans = a * b;
			return ans;
		}
		return a * b;
	}
	
	//OPERATION LOGIC
	private int doOperation() {
		switch(this.op) {
			case "+":
				if(this.saveLast)
					return sum(this.ans, this.b);
				return sum(this.a, this.b);
			case "-":
				if(this.saveLast)
					return minus(this.ans, this.b);
				return minus(this.a, this.b);
			case "*":
				if(this.saveLast)
					return multiply(this.ans, this.b);
				return multiply(this.a, this.b);
			case "/":
				if(this.saveLast)
					return divide(this.ans, this.b);
				return divide(this.a, this.b);
		default:
				return 0;
		}
	}
	
	public int returnResult() {
		return doOperation();
	}
	
}

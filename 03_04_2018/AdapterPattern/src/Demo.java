
public class Demo {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Turkey tk = new Turkey();
		
		Dog adaptCat = new DogAdapter(cat);
		Dog adaptTk = new TurkeyAdapter(tk);
		
		adaptCat.bark();
		adaptCat.bite();
		
		System.out.println();
		
		adaptTk.bark();
		adaptTk.bite();
		
	}
}


public class TurkeyAdapter implements Dog{
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void bark() {
		turkey.gooble();
	}

	@Override
	public void bite() {
		turkey.peck();
	}

}

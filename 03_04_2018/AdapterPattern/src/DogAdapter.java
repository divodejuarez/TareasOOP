
public class DogAdapter implements Dog{
	
	Cat cat;
	
	public DogAdapter(Cat cat) {
		this.cat = cat;
	}
	
	@Override
	public void bark() {
		cat.meow();
	}

	@Override
	public void bite() {
		cat.lick();
	}

}


public class User extends Observer{
	
	int id;
	boolean rastrear;
	
	public User(IProvider provider, boolean rastrear, int id){
		this.provider = provider;
		this.provider.attach(this);
		this.rastrear = rastrear;
		this.id = id;
	}
	
	@Override
	public void update() {
		System.out.println("My package has arrived!");
	}
	
	public void createPackage(){
		this.provider.attachPackage(new Package(this.id++, this));
	}
	
}

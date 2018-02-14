
public class Demo {
	public static void main(String[] args){
		DHL dhl = new DHL();
		Fedex fede = new Fedex();
		
		User user = new User(dhl, true, 0);
		
		fede.attach(user);
		dhl.attach(user);
		
		user.createPackage();
		user.createPackage();
		dhl.start();
		fede.start();
	}
}

import java.util.ArrayList;
import java.util.List;

public class CorreoMX extends Thread implements IProvider{
	
	List<Observer> observers = new ArrayList<Observer>();
	List<Package> packages = new ArrayList<Package>();
	
	@Override
	public void attach(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o.id);
		
	}

	@Override
	public void notifyAllObservers() {
		for(Observer observer : observers){
			observer.update();
		}
	}
	
	@Override
	public void attachPackage(Package p){
		packages.add(p);
	}
	
	@Override
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("Update " + i);
			try{
				sleep((int)(Math.random() * 7000));
			}catch(Exception e){}
		}
		System.out.println("Done");
		notifyAllObservers();
	}
	
	
}

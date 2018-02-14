
public interface IProvider {
	void attach(Observer o);
	void detach(Observer o);
	void attachPackage(Package p);
	void notifyAllObservers();
}

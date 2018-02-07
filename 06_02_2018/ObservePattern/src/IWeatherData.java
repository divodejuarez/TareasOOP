
public interface IWeatherData {
	
    void addObserver(Display d);
    void removeObserver(Display d);
    void notifyALL();
}

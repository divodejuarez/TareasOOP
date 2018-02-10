import java.util.Observable;

public class WeatherData extends Observable {
    
	private double temperature, humidity, pressure;
	
	public WeatherData(double temperature, double humidity, double pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		System.out.printf("The temperature, humidity and pressure today is: %.1f   %.1f   %.1f \n", temperature, humidity, pressure);
	}
	
	
	public double getTemperature() {
		return temperature;
	}

	public double getHumidity() {
		return humidity;
	}
	
	public double getPressure() {
		return pressure;
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
		setChanged();
		//notifyObservers();
		measureChanged(this);
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
		setChanged();
		//notifyObservers();
		measureChanged(this);
	}


	public void setPressure(double pressure) {
		this.pressure = pressure;
		setChanged();
		//notifyObservers();
		measureChanged(this);
	}
	
	private void measureChanged(Observable o){
		notifyObservers(o);
	}
	
	
}

import java.util.Observable;

public class WeatherData extends Observable {
    
	private double temperature, humidity, pressure;
	
	public WeatherData(double temperature, double humidity, double pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		System.out.printf("The temperature, humidity and pressure today is: %.2f   %.2f   %.2f \n", temperature, humidity, pressure);
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
		notifyObservers();
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
		setChanged();
		notifyObservers();
	}


	public void setPressure(double pressure) {
		this.pressure = pressure;
		setChanged();
		notifyObservers();
	}
	
	private void measureChanged(){
		
	}
	
	
}

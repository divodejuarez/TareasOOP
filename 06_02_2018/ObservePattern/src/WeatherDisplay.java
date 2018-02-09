import java.util.Observable;
import java.util.Observer;

public class WeatherDisplay implements Observer{

	private double temperature, humidity, pressure;
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			 temperature = ((WeatherData) o).getHumidity();
			 humidity = ((WeatherData) o).getHumidity();
			 pressure = ((WeatherData) o).getPressure();
			 
			 System.out.printf("The new temperature, humidity and pressure is: %.2f   %.2f    %.2f \n", temperature, humidity, pressure);
			
		}else{
			System.out.println("Not suscribe to change");
		}
		
	}

}

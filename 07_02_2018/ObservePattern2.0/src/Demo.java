
public class Demo {
    
	public static void main(String[] args){
        
		/*WeatherData wd = new WeatherData();
        
        new DisplayA(wd, 0);
        new DisplayB(wd, 1);
        new DisplayC(wd, 2);
        
        System.out.println("First change");
        wd.setState("Bit of info");
        System.out.println("Second change");
        wd.setState("Another bit of info");*/
		
		WeatherData wd = new WeatherData(23, 19.6, 6.5);
		WeatherDisplay w = new WeatherDisplay();
		
		wd.addObserver(w);
		
		wd.setTemperature(30.6);
		wd.setHumidity(65);
		wd.setPressure(64);
		
    }
}

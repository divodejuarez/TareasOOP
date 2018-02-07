
public class Demo {
    
	public static void main(String[] args){
        
		WeatherData wd = new WeatherData();
        
        new DisplayA(wd, 0);
        new DisplayB(wd, 1);
        new DisplayC(wd, 2);
        
        System.out.println("First change");
        wd.setState("Bit of info");
        System.out.println("Second change");
        wd.setState("Another bit of info");
    }
}

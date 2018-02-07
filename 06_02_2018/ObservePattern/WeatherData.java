import java.util.ArrayList;
import java.util.List;

public class WeatherData implements IWeatherData {
    
    private List<Display> displays = new ArrayList<>();
    private String state;
    
    @Override
    public void removeObserver(Display d){
        displays.remove(d.getID());
    }
    
    @Override
    public void addObserver(Display d) {
        displays.add(d);
    }

    @Override
    public void notifyALL() {
        for(Display display : displays){
            display.update();
        }
    }
    
    public void setState(String state){
        this.state = state;
        notifyALL();
    }
    
    public String getState(){
        return this.state;
    }
    
}

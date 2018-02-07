public class DisplayA extends Display{
    
    private int id;
    public DisplayA(WeatherData w, int id){
        this.w = w;
        this.id = id;
        this.w.addObserver(this);
    }
    
    @Override
    public void update() {
        System.out.println("Display A, I got this new info: " + w.getState());
    }
    
    @Override
    public int getID(){
        return this.id;
    }
    
}

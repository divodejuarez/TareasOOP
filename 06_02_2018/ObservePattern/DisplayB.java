public class DisplayB extends Display{
    
    private int id;
    public DisplayB(WeatherData w, int id){
        this.w = w;
        this.id = id;
        this.w.addObserver(this);
    }
    
    @Override
    public void update() {
        System.out.println("Display B, I got this new info: " + w.getState());
    }
    
    @Override
    public int getID(){
        return this.id;
    }
    
}

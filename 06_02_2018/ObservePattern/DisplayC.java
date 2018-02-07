public class DisplayC extends Display{
    
    private int id;
    public DisplayC(WeatherData w, int id){
        this.w = w;
        this.id = id;
        this.w.addObserver(this);
    }
    
    @Override
    public void update() {
        System.out.println("Display C, I got this new info: " + w.getState());
    }
    
    @Override
    public int getID(){
        return this.id;
    }
    
}

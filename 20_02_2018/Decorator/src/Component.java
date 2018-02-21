
public abstract class Component {
	
	public enum Size {TALL, GRANDE, VENTI};
	
	Size size = Size.TALL;
	String description = "Unknown beverage";
	abstract public double cost();
	
	public void setSize(Size s) {
		this.size = s;
	}
	
	public String getDescripcion() {
		return description;
	}
	
	public Size getSize() {
		return this.size;
	}
}

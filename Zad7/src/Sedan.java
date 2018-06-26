
public class Sedan extends Car{

	private double length;
	
	public Sedan(int speed, double price, String color, double length){
		super(speed, price, color);
		this.setLenght(length);
	}
	
	private void setLenght(double length){
		this.length = length;
	}
	
	public double getLenght(){
		return this.length;
	}
	
	public double getSalePrice(){
		if(this.getLenght() < 4500)
			return (this.price - (this.price/10));
		else
			return this.price;
	}
}

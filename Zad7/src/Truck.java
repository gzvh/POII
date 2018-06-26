
public class Truck extends Car{

	private double weight;
	
	public Truck(int speed, double price, String color, double weight){
		super(speed, price, color);
		this.setWeight(weight);
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public double getSalePrice(){
		if(this.weight > 3000)
			return (this.price - (this.price/10));
		else
			return this.price;
	}
	
}

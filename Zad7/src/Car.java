
public class Car {

	protected int speed;
	protected double price;
	protected String color;
	
	public Car(){
		this.speed = 200;
		this.price = 9999;
		this.color = "black";
	}
	public Car(int speed, double price, String color){
		this.setSpeed(speed);
		this.setPrice(price);
		this.setColor(color);
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void setColor(String color){
		this.color = color;
	}
	public int getSpeed(){
		return this.speed;
	}
	public double getSalePrice(){
		return this.price;
	}
	public String getColor(){
		return this.color;
	}
	
}

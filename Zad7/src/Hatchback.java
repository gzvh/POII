
public class Hatchback extends Car{
	
	private int year;
	private double manufacturerDiscount;
	
	public Hatchback(int speed, double price, String color, int year, double manufacturerDiscount){
		super(speed, price, color);
		this.setYear(year);
		this.setManufacturerDiscount(manufacturerDiscount);
	}
	
	private void setYear(int year){
		this.year = year;
	}
	
	private void setManufacturerDiscount(double manufacturerDiscount){
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public double getManufacturerDicsount(){
		return this.manufacturerDiscount;
	}
	
	public double getSalePrice(){
		return this.price-((this.getManufacturerDicsount() /100)*this.price);
	}
	
}

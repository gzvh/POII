
public class Autoshop {

	private Truck duzy;
	private Hatchback maly;
	private Sedan dlugi;
	
	public Autoshop(){
		this.duzy = new Truck(250,105000,"Brown",3400);
		this.maly = new Hatchback(150,88000,"Pink",2017,12.6);
		this.dlugi = new Sedan(184,550000,"Black",4999);
	}
	
	public void getCatalogue(){
		System.out.println("Truck: Vmax: "+this.duzy.getSpeed()+" Kolor: "+this.duzy.getColor()+" Waga: "+this.duzy.getWeight()+" Cena: "+this.duzy.getSalePrice());
		System.out.println("HatchBack: Vmax: "+this.maly.getSpeed()+" Kolor: "+this.maly.getColor()+" Rok: "+this.maly.getYear()+" Cena: "+this.maly.getSalePrice());
		System.out.println("Sedan: Vmax: "+this.dlugi.getSpeed()+" Kolor: "+this.dlugi.getColor()+" Dlugosc: "+this.dlugi.getLenght()+" Cena: "+this.dlugi.getSalePrice());
	}
}

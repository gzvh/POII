
public class Invoice {

	private String idProd;
	private String opisProd;
	private int iloscProd;
	private double cenaZaJeden;
	
	public Invoice(String id, String opis, int ilosc, double cena){
		this.setID(id);
		this.setOpis(opis);
		this.setIlosc(ilosc);
		this.setCena(cena);
	}
	
	private void setID(String id){
		this.idProd = id;
	}
	private void setOpis(String opis){
		this.opisProd = opis;
	}
	private void setIlosc(int ilosc){
		this.iloscProd = ilosc;
	}
	private void setCena(double cena){
		this.cenaZaJeden = cena;
	}
	public String getID(){
		return this.idProd;
	}
	public String getOpis(){
		return this.opisProd;
	}
	public int getIlosc(){
		return this.iloscProd;
	}
	public double getCena(){
		return this.cenaZaJeden;
	}
	public double getInvoiceAmount(){
		return this.iloscProd * this.cenaZaJeden;
	}
	public void pokazInvoice(){
		System.out.println("Id produktu: "+this.getID());
		System.out.println("Opis produktu: "+this.getOpis());
		System.out.println("Ilosc produktu: "+this.getIlosc());
		System.out.println("Cena produktu: "+this.getCena());
		System.out.println("Calkowity koszt: "+this.getInvoiceAmount());
	}
}

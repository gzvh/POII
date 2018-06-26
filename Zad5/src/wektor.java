
import java.util.Vector;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class wektor {

		private Vector<Integer>pierwszyWektor;
		private Vector<Integer>drugiWektor;
		private Vector<Integer>wyjsciowyWektor;
		private Scanner input;
		private String buforDanych;
		private String []poSplicie;
		private FileWriter daneDoZapisu;
		
		public wektor(){
			this.pierwszyWektor = new Vector<Integer>();
			this.drugiWektor = new Vector<Integer>();
			this.wyjsciowyWektor = new Vector<Integer>();
		}

		public void dodawanieDanych(){
			input = new Scanner(System.in);
			this.dodawanieW1();
			this.dodawanieW2();
			this.sumowanieDanych();
		}
		
		private void dodawanieW1(){
			System.out.println("Pierwszy wektor to: ");
			buforDanych = input.nextLine();
			poSplicie = buforDanych.split(" ");
			for(String x : poSplicie)
				pierwszyWektor.addElement(Integer.parseInt(x));
		}
		
		private void dodawanieW2(){
			System.out.println("Drugi wektor to: ");
			buforDanych = input.nextLine();
			poSplicie = buforDanych.split(" ");
			for(String x : poSplicie)
				drugiWektor.addElement(Integer.parseInt(x));
		}
		
		private void sumowanieDanych(){
			try{
				if(pierwszyWektor.size() != drugiWektor.size())
					throw new DifferentVectorSizeException(pierwszyWektor.size(), drugiWektor.size());
				
				for(int i = 0; i<pierwszyWektor.size(); i++)
					wyjsciowyWektor.addElement(pierwszyWektor.get(i) + drugiWektor.get(i));
				this.zapisDanych();
				System.out.println(wyjsciowyWektor.toString());
			}
			catch(DifferentVectorSizeException e){
				if(pierwszyWektor.size() < drugiWektor.size()){
					System.out.println("Dopelnij pierwszy wektor o: "+(drugiWektor.size() - pierwszyWektor.size())+"miejsc");
					this.dodawanieW1();
				}
				else{
					System.out.println("Dopelnij drugi wektor o: "+(pierwszyWektor.size()-drugiWektor.size())+"miejsc");
					this.dodawanieW2();
				}
				if(pierwszyWektor.size() == drugiWektor.size())
					this.sumowanieDanych();
				else
					System.out.println("Blad");
			}
			catch(IOException e){
				System.out.println("Blad: "+e);
			}
		}
		
		private void zapisDanych() throws IOException{
			String plik = "dane.txt";
			daneDoZapisu = new FileWriter(plik);
			daneDoZapisu.write(wyjsciowyWektor.toString());
			daneDoZapisu.close();
		}
}

package Zad1_moze;

import java.util.Scanner;
import java.util.Random;


public class Zad1_moze {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		boolean powtorz = true;
		boolean wygrana;
		
		
		while(powtorz){
			
			System.out.println("Zgadnij numer z zakresu od 1 do 100");
			int liczbaDoZgadniecia = random.nextInt(100);
			int liczbaProb = 0;
			int proba;
			wygrana = true;
			
			while(wygrana){
				
				proba = input.nextInt();
				liczbaProb++;
				
				if(proba == liczbaDoZgadniecia){
					System.out.println("Zgadles!");
					System.out.println("Liczba do zgadniecia to: "+liczbaDoZgadniecia);
					System.out.println("Liczba prob: "+liczbaProb);
					wygrana = false;
				}
				else if (proba < liczbaDoZgadniecia){
					System.out.println("Liczba jest za mala");
				}
				else if (proba > liczbaDoZgadniecia){
					System.out.println("Liczba jest za duza");
				}
			}
			
			System.out.println("Czy chcesz zagrac jeszcze raz? Y/N");
			input2 = new Scanner(System.in);
			char odpowiedz = input2.nextLine().charAt(0);
			if(odpowiedz == 'N' || odpowiedz == 'n')
				powtorz = false;
			else if(odpowiedz== 'Y' || odpowiedz == 'y'){
				System.out.println("Jeszcze raz");
			}
			else
			{
				System.out.println("BLAD!");
				powtorz = false;
			}
		}
		input.close();
		input2.close();
	}

}

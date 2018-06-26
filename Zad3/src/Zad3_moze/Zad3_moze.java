package Zad3_moze;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Zad3_moze {

	public static void main(String[] args) throws IOException{

		double a, b, c, delta, x1, x2;
		Scanner input = new Scanner(System.in);
		
		try{
			System.out.println("Podaj liczbe a: ");
			a = input.nextDouble();
			System.out.println("Podaj liczbe b: ");
			b = input.nextDouble();
			System.out.println("Podaj liczbe c: ");
			c = input.nextDouble();
			input.close();
		}
		catch(InputMismatchException e){
			System.out.println("Nieodpowiednia liczba");
			return;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Zla liczba argumentow");
			return;
		}
		
		delta = Math.pow(b, 2) - 4*a*c;
		System.out.println(delta);
		
		BufferedWriter zapis = new BufferedWriter(new FileWriter(args[0], true));
		zapis.write("a: "+a+", b: "+b+", c: "+c+", delta: "+delta);
		
		if(delta > 0){
			x1 = (-b - Math.sqrt(delta)) / (2*a);
			x2 = (-b + Math.sqrt(delta)) / (2*a);
			System.out.println("Istnieja dwa miejsca zerowe x1: "+x1+" i x2: "+x2);
			zapis.write(", x1: "+x1+", x2: "+x2);
		}
		else if(delta == 0){
			x1 = -b / (2*a);
			System.out.println("Istnieje jedno miejsce zerowe x1: "+x1);
			zapis.write(", x1: "+x1);
		}
		else{
			System.out.println("Nie istnieja miejsca zerowe");
			zapis.write(", Brak miejsc zerowych");
		}
		zapis.newLine();
		zapis.close();
	}
}

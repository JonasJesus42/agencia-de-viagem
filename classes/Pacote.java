package classes;

import java.util.ArrayList;
import java.util.Scanner;



public class Pacote {
	private ArrayList<String> locais = new ArrayList<String>();
	private ArrayList<String> prices = new ArrayList<String>();
	
	public void cadastraPacotes() {
		System.out.println("Qual o local do pacote?: ");
		this.locais.add(entrada.nextLine());
		
		System.out.println("Qual o valor do pacote?: ");
		this.prices.add(entrada.nextLine());
	}
	
	public String getLocais(int i) {
		return this.locais.get(i);
	}
	
	public String getPrices(int i) {
		return this.prices.get(i);
	}
	
	
	Scanner entrada = new Scanner(System.in);
}

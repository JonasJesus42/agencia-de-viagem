package classes;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	private ArrayList<String> nomes = new ArrayList<>();
	private ArrayList<String> destino = new ArrayList<>();

	public void cadastro() {
		System.out.print("Qual o seu Nome?: "); 
		this.nomes.add(entrada.next());

		System.out.print("Para onde pretrende ir?: ");
		this.destino.add(entrada.nextLine());
	}
	
	public void setNomes(String nome) {
		this.nomes.add(nome);
	}
	
	public void setDestino(String destino) {
		this.nomes.add(destino);
	}
	
	public String getNomes(int index ) {
		
		return nomes.get(index);
		
	}

	public String getDestino(int posicao) {
		return this.destino.get(posicao);
	}
	
	Scanner entrada = new Scanner(System.in);
}

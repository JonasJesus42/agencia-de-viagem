package main;

import java.util.Scanner;

import classes.Cliente;
import classes.Pacote;

public class Agencia {

	public static void main(String[] args) {
	
		Cliente cliente = new Cliente();
		Pacote pacotes = new Pacote();
		Scanner entrada = new Scanner(System.in);

		boolean sair = false;

		while (!sair) {
			int option;
			System.out.println("");
			System.out.println("Bem vindo a Agência Viajante");
			System.out.println("");
			System.out.println("escolha uma opção:");
			System.out.println("");
			System.out.println("Cadastra  cliente    ( 1 )");
			System.out.println("Consultar cadastro   ( 2 )");
			System.out.println("Cadastra  pacotes    ( 3 )");
			System.out.println("Consultar pacotes    ( 4 )");
			System.out.println("Sair                 ( 0 )");
			System.out.println("");
			System.out.print("Digite a opção: ");
			option = entrada.nextInt();

			switch (option) {
			case 0:
				System.out.println("");
				System.out.println("Ate a proxima!");
				sair = true;
				break;
			case 1:
				boolean continuarCadastrando = false;
				
				String option1;
					while(!continuarCadastrando){
						
						cliente.cadastro();
						System.out.println("");
						System.out.print("Cadatrar mais cliente?. Sim(S) e não(N): " );	
						option1 = entrada.next();
						if(option1.equals("n") || option1.equals("N")) {
							continuarCadastrando = true;
						}
					}				
				break;

			case 2:
			
			    boolean semNome = false;  
			    int posicao2 = 0;
			
				while(!semNome) {
					
					try {
						System.out.println(posicao2+1+"° Nome: "+cliente.getNomes(posicao2)+", Seu destino é para "+cliente.getDestino(posicao2));
					} catch (IndexOutOfBoundsException  exeption) {
						System.out.println("");
						System.out.println("============!!===========");
						System.out.println("Sem mais clientes cadastrados!");
						System.out.println("============!!===========");
						System.out.println("");
						semNome = true;
					}	
					posicao2++;
				}
						
				break;
			case 3:
				boolean continuarCadastrandoPacotes = false;
				
				String optionDePacotes;
					while(!continuarCadastrandoPacotes){
						
						pacotes.cadastraPacotes();
						System.out.println("");
						System.out.print("Cadatrar mais pacotes?. Sim(S) e não(N): " );	
						optionDePacotes = entrada.next();
						if(optionDePacotes.equals("n") || optionDePacotes.equals("N")) {
							continuarCadastrandoPacotes = true;
						}
					}				
				break;
				
			case 4: 
				boolean semPacotes = false;  
			    int posicao3 = 0;
			
				while(!semPacotes) {
					
					try {
						System.out.println(posicao3+1+"° Pacote: "+pacotes.getLocais(posicao3)+", Seu preço é "+pacotes.getPrices(posicao3));
					} catch (IndexOutOfBoundsException  exeption) {
						System.out.println("");
						System.out.println("============!!===========");
						System.out.println("Sem mais pacotes cadastrados!");
						System.out.println("============!!===========");
						System.out.println("");
						semPacotes = true;
					}	
					posicao3++;
				}
				break;
		
			default:
				break;
			}

		}
		
		entrada.close();

	}

}

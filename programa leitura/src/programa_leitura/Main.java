package programa_leitura;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Scanner in = new Scanner (System.in);
		
		String nome,idade,peso,cidade,estado,pais;
		System.out.println("Por favor bb carai nomezin:");
		nome = in.nextLine();
		if (nome == "luis") 
			System.out.println("botofe");
		else 
			System.out.println("naoo");
		
		System.out.println("Por favor bb carai anos:");
		idade = in.nextLine();
		System.out.println("Por favor bb carai kg:");
		peso = in.nextLine();
		System.out.println("Por favor bb carai location:");
		cidade = in.nextLine();
		if(cidade.equals(1)) {
			System.out.println("so");
		}else {
			System.out.println("TAPORRR PCRKKKK");
		}
	
		System.out.println("Por favor bb carai state:");
		estado = in.nextLine();
		System.out.println("Por favor bb carai country baby:");
		pais = in.nextLine();
		//Resultado!
		
		System.out.println("*------------*");
		System.out.println("O vulgo do puto:" +nome);
		System.out.println("A idade dele:" +idade);
		System.out.println("Peso do frangote:" +peso);
		System.out.println("Cidade:" +cidade);
		System.out.println("Estado:" +estado);
		System.out.println("Pais de origem da anomalia:" +pais);
		*/	
		
		Scanner entrada = new Scanner(System.in);

       
        Random rand = new Random();

  
        String nome;

        System.out.println("Seja bem-vindo ao jogo! Insira o seu nome: ");
   
        nome = entrada.nextLine();
        System.out.println("Seja muito bem-vindoo(a) " + nome);
        System.out.println("Você deseja avançar para qual direção ? (w, s, a, d) ");
        String comando = entrada.nextLine();
        if(comando.equals("w")){
            System.out.println("Você está indo para frente!");
            System.out.println("Um inimigo surgiu, o que deseja fazer ? (a = atacar, c = correr) ");

            comando = entrada.nextLine();
            if(comando.equals("a")){
            	if(rand.nextInt(100)<30) {
            		System.out.println("Voce conseguiu obliterar-lo");
            	}else {
            		System.out.println("Voce morreu");
            	}
            }else {
            	System.out.println("Voce correu! Jogo terminou");
            	
            }
        }else if(comando.equals("s")) {
        	System.out.println("Voce esta entrando em outro mapa...");
        	System.out.println("3, 2, 1...");
        	System.out.println("Voce acaba de chegar em IONIA!");
        	System.out.println("Seja muito bem-vindo a IONIA " + nome);
            System.out.println("Você deseja avançar para qual direção ? (w, s, a, d) ");
            comando = entrada.nextLine();
            switch(comando) {
            
            case "w":
            	System.out.println("Voce esta avancando pela costa da praia");
            	System.out.println("Apareceu um carangueijo inimigo");
            	System.out.println("Oque deseja fazer? (a = atacar, c = correr)");
            	comando = entrada.nextLine();
                if(comando.equals("a")){
                	if(rand.nextInt(100)<50) {
                		System.out.println("Voce conseguiu obliterar-lo");
                	}else {
                		System.out.println("Voce morreu");
                	}
                }else {
                	System.out.println("Voce correu! Jogo terminou");
            
                }
            case "a":
            	
            }
            }
        }
    }

		            	
		            	
		            	
		
			        
			
	
	


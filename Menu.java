package Aqui;

import java.util.Scanner;

public class Menu {

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("==========");
		System.out.println("Gamer Land");
		System.out.println("==========");
	
		System.out.println();
		System.out.println("[1] - Produtos");
		System.out.println("[2] - Sobre a loja");
		System.out.println("[3] - Contato");
		System.out.println("[4] - Sair");
		
		System.out.println("ecolha uma das opçoes:");
        num = sc.nextInt();
	    
        do {
    	if(num == 1) { 
			System.out.println("Produtos : ");
			System.out.println("======================");
			System.out.println("1 : Gabinetes");
			System.out.println("2 : Placas de vídeo");
			System.out.println("3 : Processadores");
			System.out.println("4 : Placas mãe");
	        System.out.println("5 : SSDS");
	        System.out.println("6 : Telas");
	        System.out.println("======================");
	        break;
	    }
	        if(num == 2) {
			System.out.println("About");
			break;
	       }
	        if(num == 3) {
	        	System.out.println("Contatos");
	        	break;
	        }
	        if(num == 4) {
	        	System.out.println("Sistema encerrado");
                System.exit(0);
                break;
                
	        }
	        
       }while( num != '1' && num != '2' && num != '3');
  }
}
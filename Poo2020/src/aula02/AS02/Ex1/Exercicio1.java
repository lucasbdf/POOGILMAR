package aula02.AS02.Ex1;

import java.util.Scanner;

public class Exercicio1 {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String nome[] = new String[3];
        int idade[] = new int[3];
        int maior = -9999, menor = 9999;
        
        
        for (int i=0; i<3; i++) {
            System.out.println ("Insira o nome da pessoa: ");
            nome[i] = input.nextLine();
        }
        
        	int i=0;
        	for (int j=0; j<3; j++) {
        		System.out.println ("Insira a idade do(a) " +nome[i++]);
        		idade[j] = input.nextInt();
        	}	
        
        	for (int j=0; j<3; j++) {
            
        		if (idade[j] < menor) {  
        			menor = idade[j];
            
        		}
  
        			for (j=0; j<3; j++) {
        
        				if (idade[j] > maior) {
        					maior = idade[j];
        		}

	       }
	  
        		System.out.println("Maior idade digitada: " +maior);
    
        	}
    	}
}
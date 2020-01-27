package aula02.AS02;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){

     Scanner teclado = new Scanner(System.in);
     int IdadeMaior=0;
     int Idade;
     String Cordecabelo;        
     String Cordeolho;          
     String Sexo;              
     int i=0,especifico=0;

     	while(i == 0){
     		System.out.println("A idade maxima: ");
     		IdadeMaior = Integer.parseInt(teclado.nextLine());
     		System.out.println("Idade: ");
     		Idade = Integer.parseInt(teclado.nextLine());
     		System.out.println("Cor do cabelo: ");
     		Cordecabelo = teclado.nextLine();
     		System.out.println("Cor do olho: ");
     		Cordeolho = teclado.nextLine();
     		System.out.println("Qual o sexo? ");
     		Sexo = teclado.nextLine();

     		System.out.println("Maior idade: " +IdadeMaior);

     		System.out.println("Idade: " +Idade);

     		System.out.println("Cor do cabelo: " + Cordecabelo);

     		System.out.println("Cor do olho: " + Cordeolho);

     		System.out.println("Sexo: " + Sexo);


         System.out.println("Digitar novamente? 0-Sim 1-Não");
         i = Integer.parseInt(teclado.nextLine());

     }
    }
}



package aula01.AS01.Ex5;
import java.util.Scanner;

public class exercicio5 {

    public static void main(String[]args){
        
    	Scanner entra = new Scanner(System.in);

        String nome, Funcionario;
        double salario, salarioMax, soma, mediaSalario, i = 0;
        System.out.println("Funcion�rio: ");

        nome = entra.next();
        Funcionario = nome;

        System.out.println("Qual o sal�rio do funcion�rio? ");
        salario = entra.nextDouble();

        salarioMax = salario;
        soma = salario;

        for (; i < 3; i++){

            System.out.println("Nome do funcion�rio: ");

            nome = entra.next();

            System.out.println("Fale o sal�rio: ");

            salario = entra.nextDouble();

            if (salario > salarioMax)

                salarioMax = salario;
            Funcionario = nome;
            soma = soma + salario;

        }

        mediaSalario = soma / i;

        System.out.println("Sal�rio maior "+ salarioMax +" � de: "+ Funcionario);
        System.out.println("\n");
        System.out.println("Nome Funcion�rio "+ nome);
        System.out.println("\n");
        System.out.println("M�dia de sal�rios: "+ mediaSalario);

    }

}
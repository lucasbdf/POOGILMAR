package aula01.AS01.Ex5;
import java.util.Scanner;

public class exercicio5 {

    public static void main(String[]args){
        
    	Scanner entra = new Scanner(System.in);

        String nome, Funcionario;
        double salario, salarioMax, soma, mediaSalario, i = 0;
        System.out.println("Funcionário: ");

        nome = entra.next();
        Funcionario = nome;

        System.out.println("Qual o salário do funcionário? ");
        salario = entra.nextDouble();

        salarioMax = salario;
        soma = salario;

        for (; i < 3; i++){

            System.out.println("Nome do funcionário: ");

            nome = entra.next();

            System.out.println("Fale o salário: ");

            salario = entra.nextDouble();

            if (salario > salarioMax)

                salarioMax = salario;
            Funcionario = nome;
            soma = soma + salario;

        }

        mediaSalario = soma / i;

        System.out.println("Salário maior "+ salarioMax +" é de: "+ Funcionario);
        System.out.println("\n");
        System.out.println("Nome Funcionário "+ nome);
        System.out.println("\n");
        System.out.println("Média de salários: "+ mediaSalario);

    }

}
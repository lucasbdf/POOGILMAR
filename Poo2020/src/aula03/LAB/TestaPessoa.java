package aula03.LAB;
import java.util.Scanner;
import java.util.Date;


public class TestaPessoa {
		
	private String especie;

	public static void main(String[] args){

	Pessoa p1 = new Pessoa();

	p1.setNome("Rafael");
	p1.setDataNascimento(new Date());

	System.out.println("Dados da pessoa P1:\n");
	System.out.println("Nome: " + p1.getNome());
	System.out.println("Data de nascimento: " + p1.getDataNascimento());
	System.out.println("Especie "+ p1.especie);

	Pessoa p2 = new Pessoa();
	p2.setNome ("José");
	System.out.println("Especie "+ p1.especie);

	}
		
	

}


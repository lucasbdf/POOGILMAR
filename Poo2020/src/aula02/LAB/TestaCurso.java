package aula02.LAB;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestaCurso {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Curso curso1 = new Curso();
		System.out.println("Nome do Curso C1: ");
		curso1.nome = sc.nextLine();
		
		System.out.println("area do Curso C1: ");
		curso1.area = sc.nextLine();
		
		System.out.println("duracao do Curso C1: ");
		curso1.duracao = Integer.parseInt(sc.nextLine());
		
		System.out.println("Curso 2:  "+ curso1.nome+" - " + curso1.area + " - " + curso1.duracao);
		curso1.nome = sc.nextLine();
		
		//c1.nome = "Engenharia de Software";
				
		//c1.nome = JOptionPane.showInputDialog("Entre com o nome do curso");
		
		//JOptionPane.showMessageDialog(null, "Nome do Curso C1 é: " + c1.nome);
		
		
		//System.out.println("Nome do Curso C1: " + c1.nome);
		
	}

}

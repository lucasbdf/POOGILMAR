package aula03.LAB;

import aula03.LAB.Quadrado;

public class TestaQuadrado {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		
		
		q1.cor = "verde";
		q3.cor = "Rosa";
		
		System.out.println("Cor do quadrado 1: "+ q1.cor);
		System.out.println("Cor do quadrado 1: "+ q2.cor);
		System.out.println("Cor do quadrado 1: "+ q3.cor);
		

	}

}

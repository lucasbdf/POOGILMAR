package aula10.LAB;

public class Gerente extends Funcionario {
	private int senha;

	public double bonificacao() {
		double b = salario * 0.15;
		return b;
	}
}

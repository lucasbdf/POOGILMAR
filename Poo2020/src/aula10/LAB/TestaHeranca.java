package aula10.LAB;

public class TestaHeranca {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSalario(3000);
		System.out.println("A bonificacao �: " + g.bonificacao());
		
		Funcionario f = new Funcionario();
		f.setSalario(3000);
		System.out.println("A bonificacao �: " + f.bonificacao());
		
		Funcionario ger = new Gerente();
		ger.setSalario(3000);
		System.out.println("O valor da bonifica��o � " + ger.bonificacao());
		
		
	}

}

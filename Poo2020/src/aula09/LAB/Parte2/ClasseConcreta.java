package aula09.LAB.Parte2;

public class ClasseConcreta extends ClasseAbstrata {

	@Override
	public void metodoAbstrato() {
		System.out.println("Implementa��o do m�todo abstrato na classe: " + this.getClass().getSimpleName());
		
	}
	
	public static void main(String[] args) {
		ClasseConcreta cc = new ClasseConcreta();
		cc.metodoAbstrato();
		cc.metodoConcreto();
	}
}

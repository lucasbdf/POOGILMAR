package aula10.LAB;

public class Anfibio extends Animal {

	public Anfibio(String nome) {
		super(nome);
		
	}
	
	public void mover(int x, int y) {
		setCoordenadas(x,y);
		System.out.println("movimento do anfíbio " + this.getNome());
	}
	
	
}	

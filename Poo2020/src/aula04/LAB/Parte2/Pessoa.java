package aula04.LAB.Parte2;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa(String n, String e, String t){
		this.nome = n;
		this.endereco = e;
		this.telefone = t;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String toString(){
		StringBuffer sb= new StringBuffer();
		sb.append("\nNome da pessoa: " + this.getNome());
		sb.append("\nEndere�o da pessoa: " + this.getEndereco());
		sb.append("\nTelefone da pessoa: " + this.getTelefone());
		return sb.toString();
	}
}

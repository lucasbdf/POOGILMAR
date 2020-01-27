package aula04.LAB.Parte2;

public class PessoaFisica extends Pessoa {
	public String cpf;
	public String estadoCivil;
	private String sexo;
	
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public PessoaFisica(String nome, String endereco, String telefone,
			String cpf, String estadoCivil, String sexo){
		super(nome, endereco, telefone);
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
	}

	
	
	public String toString(){
		StringBuffer sb= new StringBuffer();
		sb.append(super.toString());
		sb.append("\nCPF da pessoa FIsica: \n" + this.getCpf());
		sb.append("\nSexo da pessoa FIsica: \n" + this.getEstadoCivil());
		sb.append("\nNome da pessoa FIsica: \n" + this.getSexo());
		return sb.toString();
	}

}

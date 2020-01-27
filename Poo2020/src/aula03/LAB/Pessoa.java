package aula03.LAB;
import java.util.Date;
import java.util.Scanner;

public class Pessoa {
	private String nome;
	private Date dataNascimento;
	public final String especie = "Mamifero";
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



}
package aula06.LAB;
import java.util.List;
import java.util.ArrayList;
import java.util.List;


public class Bairro {
    private String regiao;
    private String nome;
    private Municipio municipio;
    private List<Endereco>enderecos;

    public Bairro(String regiao, String nome, Municipio municipio) {
        this.regiao = regiao;
        this.nome = nome;
        this.municipio = municipio;
        this.enderecos = new ArrayList<Endereco>();
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public void adicionaEndereco(Endereco e){
        this.enderecos.add(e);
    }

    public Endereco consultapeloEndereco(String e) {
        Endereco novoEndereco = null;

        return novoEndereco;
    }

    public void removeEndereco(Endereco e){
        this.enderecos.remove(e);
    }

}



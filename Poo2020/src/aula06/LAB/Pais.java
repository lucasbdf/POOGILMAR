package aula06.LAB;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nome;
    private List<Estado> estados;

    public Pais(String nome, List<Estado> estados) {
        this.nome = nome;
        this.estados = new ArrayList<Estado>();

    }

    public Pais(String brasil) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

    public void adicionaEstado(Estado e){
        this.estados.add(e);
    }

    public Estado consultarEstado(Estado nome){
        Estado novoEstado = null;
        for (Estado e: this.estados){
            if (e.getNome().equals(nome)){
                novoEstado=e;
            }
        }
        return novoEstado;
    }

    public void removeEstado(Estado e){
        this.estados.remove(e);
    }
}

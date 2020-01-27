package aula06.LAB;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;


public class Estado {
    private String sigla;
    private String nome;
    private Pais pais;
    private List<Municipio> municipios;

    public List<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(List<Municipio> municipios) {
        this.municipios = municipios;
    }

    public Estado(String sigla, String nome, Pais pais, List<Municipio> municipios){
        this.sigla = sigla;
        this.nome = nome;
        this.pais = pais;
        this.municipios = new ArrayList<Municipio>();
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void adicionaMunicipio(Municipio m){
        this.municipios.add(m);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Estado estado = (Estado) o;

        if (sigla != null ? !sigla.equals(estado.sigla) : estado.sigla != null) return false;
        if (nome != null ? !nome.equals(estado.nome) : estado.nome != null) return false;
        if (pais != null ? !pais.equals(estado.pais) : estado.pais != null) return false;
        return municipios != null ? municipios.equals(estado.municipios) : estado.municipios == null;
    }

    @Override
    public int hashCode() {
        int result = sigla != null ? sigla.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (pais != null ? pais.hashCode() : 0);
        result = 31 * result + (municipios != null ? municipios.hashCode() : 0);
        return result;
    }

    public Municipio consultapeloNome(String m) {
        Municipio novoMunicipio = null;
        for (Municipio m : this.municipios) {
            if (m.getNome().equals(nome)) {
                novoMunicipio = m;
            }
        }
        return novoMunicipio;
    }

    public void removeMunicipio(Municipio m){
        this.municipios.remove(m);
    }



}

package aula06.LAB;


public class Municipio {
    private Long codIBGE;
    private String nome;
    private Estado estado;
    private Bairro bairros;

    public Long getCodIBGE() {
        return codIBGE;
    }

    public void setCodIBGE(Long codIBGE) {
        this.codIBGE = codIBGE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Municipio(Long codIBGE, String nome, Estado estado) {
        this.codIBGE = codIBGE;
        this.nome = nome;
        this.estado = estado;

    }}
    /*public void adicionaBairro(Bairro b){
        this.bairros.add(b);
    }

    public Bairro consultapeloNome(String nome) {
        Bairro novoBairro = null;
        for (Municipio m : this.bairros) {
            if (m.getNome().equals(nome)) {
                novoBairro = bairros;
            }
        }
        return novoBairro;
    }

    public void removeBairo(Municipio b){
        this.bairros.remove(b);
    }
}
*/


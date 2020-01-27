package aula06.LAB;


public class Endereco {
    private String complemento;
    private Integer cep;
    private String numero;
    private String tipo;
    private Bairro bairro;
    private Logradouro logradouro;


    public Endereco(String complemento, Integer cep, String numero, String tipo, Bairro bairro, Logradouro logradouro) {
        this.complemento = complemento;
        this.cep = cep;
        this.numero = numero;
        this.tipo = tipo;
        this.bairro = bairro;
        this.logradouro = logradouro;

    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Imprimindo endereco: ");
        sb.append("Tipo do endereco: "+ this.getTipo());
        sb.append(this.getLogradouro().getTipo().toString());
        sb.append(this.getLogradouro().getNome());
        sb.append(this.getNumero());
        sb.append(this.getComplemento());
        sb.append(this.getBairro());
        sb.append(this.getBairro().getNome());
        sb.append(this.getBairro().getMunicipio().getNome());
        sb.append(this.getBairro().getMunicipio().getEstado().getNome());
        sb.append(this.getBairro().getMunicipio().getEstado().getPais().getNome());
    }
}

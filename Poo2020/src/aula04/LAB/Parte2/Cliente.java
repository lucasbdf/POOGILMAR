package aula04.LAB.Parte2;

import java.util.ArrayList;
import java.util.List;


public class Cliente extends PessoaFisica {
        private double renda;
        private List<String> interesses;
        private String profissao;

    public double getRenda() {
        return renda;
    }

    public List<String> getInteresses() {
        return interesses;
    }

    public void setInteresses(List<String> interesses) {
        this.interesses = interesses;
    }

    public String getProfissao() {

        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public Cliente(String nome, String endereco, String telefone,
                   String cpf, String estadoCivil, String sexo,
                   double renda, String profissao){
            super(nome, endereco, telefone, cpf, estadoCivil, sexo);
            this.renda = renda;
            this.profissao = profissao;
            interesses = new ArrayList<String>();
        }

        public String toString(){
            StringBuffer sb = new StringBuffer();
            sb.append(super.toString());
            sb.append("\nRenda do cliente "+ this.getRenda());
            sb.append("\nProfissao do cliente: "+ this.getProfissao());
            return sb.toString();
        }
}

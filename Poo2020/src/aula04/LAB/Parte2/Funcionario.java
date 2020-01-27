package aula04.LAB.Parte2;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(){}

    public Funcionario(String n, String c, double s){
        this.nome = n;
        this.cpf = c;
        this.salario = s;
    }

   public double calcularBonificacao(){
        return this.salario *= 1.1;
   }

   public double getSalario(){
       return salario;
   }
}

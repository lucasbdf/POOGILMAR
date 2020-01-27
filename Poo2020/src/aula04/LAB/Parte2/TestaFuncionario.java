package aula04.LAB.Parte2;


public class TestaFuncionario {
    public static void main(String[] args){
        Funcionario f =new Funcionario("Rafael", "102", 1000.d);

        Funcionario g =new Gerente("Antonio Junio", "172", 2000.d);

        System.out.println("Valor do Salario Funcionario sem bonificacao: " + f.getSalario());
        System.out.println("Valor do Salario Funcionario com bonificacao: " + f.calcularBonificacao());
        System.out.println("Valor do Salario gerente sem bonificacao: " + f.getSalario());
        System.out.println("Valor do Salario gerente com bonificacao: " + f.calcularBonificacao());


    }
}

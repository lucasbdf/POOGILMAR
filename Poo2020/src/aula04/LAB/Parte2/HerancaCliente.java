package aula04.LAB.Parte2;


public class HerancaCliente {
    public static void main(String[] args){
        Pessoa pessoa = new Cliente("Juau", "goiania", "32423423", "2221",
                "Solteiro", "Masc", 5000.00, "Pedreiro");

        System.out.println("Dados do Cliente: " + pessoa.toString());


    }
}

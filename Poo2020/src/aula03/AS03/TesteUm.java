package aula03.AS03;
import java.util.Date;


public class TesteUm {
    public static void main(String[] args){
        Exercicio1 p = new Exercicio1();

        p.setNome("Rafael");
        p.setDataNascimento(new Date());
        p.setAltura(1.80f);

        System.out.println("Os dados da pessoa: " + p.getNome());
        System.out.println("Data de nascimento da pessoa " + p.getDataNascimento());
        System.out.println("Altura da pessoa: " + p.getAltura());

    }
}

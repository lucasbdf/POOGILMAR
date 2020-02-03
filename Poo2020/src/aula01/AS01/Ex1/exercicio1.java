package aula01.AS01.Ex1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exercicio1 {

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in); /* cria objeto para leitura */
        String nome = "";
        String matricula = "";
        int quantidade = 0;
        System.out.println("Entre com a quantidade de alunos listados:");
        quantidade = sc.nextInt();
        var myList = new ArrayList<String>();


        for (int i = 0; i < quantidade; i++) {
            if (i != 0) {
                System.out.println("Entre com o nome do aluno:");
                System.out.println("Entre com a matrícula do aluno:");
                nome = sc.nextLine();
                matricula = sc.nextLine();
                myList.add("Aluno : " + nome + " - matricula : " + matricula + "\n");
            }
        }

        System.out.println(myList);

    }

}
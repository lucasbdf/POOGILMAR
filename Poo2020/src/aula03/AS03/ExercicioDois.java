package aula03.AS03;

import java.util.Scanner;
import java.util.Vector;

public class ExercicioDois {

    private static int total_pessoas;
    private static char name[];
    private static int agend_idade;
    private static String agend_nomes;
    private static double agend_altura;
    static Vector set_name = new Vector<String>();
    static Vector set_age = new Vector<Integer>();
    static Vector set_altura = new Vector<Double>();

    public void quantidade_de_pessoa(int qtdade) {
        total_pessoas = qtdade;
        name = new char[qtdade];

    }

    @SuppressWarnings("unchecked")
    public static void set_armazenaPessoa(int i) {
        Scanner in_teclado;
        System.out.println("Digite o nome da " + (i + 1) + "  pessoa");
        in_teclado = new Scanner(System.in);
        agend_nomes = in_teclado.nextLine();
        System.out.println("Digite a idade da " + (i + 1) + " pessoa");
        in_teclado = new Scanner(System.in);
        agend_idade = in_teclado.nextInt();
        System.out.println("Digite a altura da " + (i + 1) + " pessoa");
        in_teclado = new Scanner(System.in);
        String altura = in_teclado.nextLine();
        agend_altura = Double.parseDouble(altura);


        set_name.add(i, agend_nomes);
        set_age.add(i, agend_idade);
        set_altura.add(i, agend_altura);

    }

    public static void get_imprimeAgenda(int qtdade_impressao) {

        System.out.println((qtdade_impressao + 1) + " )nome: " + set_name.get(qtdade_impressao));
        System.out.println("idade: " + set_age.get(qtdade_impressao));
        System.out.println("altura: " + set_altura.get(qtdade_impressao));

    }

    @SuppressWarnings("unchecked")
    public static void removePessoa(int remove_index) {
        set_name.set(remove_index, null);
        set_age.set(remove_index, null);
        set_altura.set(remove_index, null);
    }

    public static int buscaPessoa(String nome_busca) {

        int position = -1;
        for (int i = 0; i < total_pessoas; i++) {
            if (set_name.get(i).equals(nome_busca)) {
                position = i;
            }
        }
        return position;
    }

    public static int getTotal_pessoas() {
        return total_pessoas;
    }

    public static void setTotal_pessoas(int total_pessoas) {
        ExercicioDois.total_pessoas = total_pessoas;
    }

    public static char[] getName() {
        return name;
    }

    public static void setName(char[] name) {
        ExercicioDois.name = name;
    }

    public static int getAgend_idade() {
        return agend_idade;
    }

    public static void setAgend_idade(int agend_idade) {
        ExercicioDois.agend_idade = agend_idade;
    }

    public static String getAgend_nomes() {
        return agend_nomes;
    }

    public static void setAgend_nomes(String agend_nomes) {
        ExercicioDois.agend_nomes = agend_nomes;
    }

    public static double getAgend_altura() {
        return agend_altura;
    }

    public static void setAgend_altura(double agend_altura) {
        ExercicioDois.agend_altura = agend_altura;
    }

    public static Vector getSet_name() {
        return set_name;
    }

    public static void setSet_name(Vector set_name) {
        ExercicioDois.set_name = set_name;
    }

    public static Vector getSet_age() {
        return set_age;
    }

    public static void setSet_age(Vector set_age) {
        ExercicioDois.set_age = set_age;
    }

    public static Vector getSet_altura() {
        return set_altura;
    }

    public static void setSet_altura(Vector set_altura) {
        ExercicioDois.set_altura = set_altura;
    }
}



package aula01.AS01;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        String telefone;
        char c;
        int i, n, ctalfa = 0, ctnum = 0;

        System.out.print("Informe um nome:\n");
        nome = ler.nextLine();

        System.out.print("Informe um telefone:\n");
        telefone = ler.nextLine();


        System.out.println();

        n = nome.length();
        for (i=0; i<n; i++) {
            c = nome.charAt(i);
            if(Character.isDigit(n)) {
                if (((c >= 'A') && (c <= 'Z')) ||
                        ((c >= 'a') && (c <= 'z'))) {
                    ctalfa = ctalfa + 1;
                    System.out.printf("%c letra\n", c, ctalfa);
                }
            }

            else if ((c >= '0') && (c <= '9')) {
                ctnum = ctnum + 1;
                System.out.printf("%c  numero\n", c, ctnum);
            }
            else  System.out.printf("%c letra\n", c);
        }

        n = telefone.length();
        for (i=0; i<n; i++) {
            c = telefone.charAt(i);
            if(Character.isDigit(n)) {
                if (((c >= 'A') && (c <= 'Z')) ||
                        ((c >= 'a') && (c <= 'z'))) {
                    ctalfa = ctalfa + 1;
                    System.out.printf("%c  letra\n", c, ctalfa);
                }
            }

            else if ((c >= '0') && (c <= '9')) {
                ctnum = ctnum + 1;
                System.out.printf("%c numero\n", c, ctnum);
            }
            else  System.out.printf("%c letra\n", c);
        }

    }
}
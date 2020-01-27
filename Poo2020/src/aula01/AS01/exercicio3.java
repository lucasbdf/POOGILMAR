package aula01.AS01;
import java.util.*;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Digite a quantidade de numeros a ser buscado:");
        int a = scan1.nextInt();

        int i, j, k = 0;
        var listBusca = new ArrayList<Integer>();
        int num[] = new int[a];
        int numeroDigitado[] = new int[a];
        int numeroAserBuscado = 0;
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Digite algum numero: ");

        for (i = 0; i < a; i++)
            num[i] = scan2.nextInt();

        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                if (num[i] > num[j])
                    k++;
            }
            numeroDigitado[i] = k++;
            k = 0;
        }

        System.out.print("Ordem Crescente: ");
        for (i = 0; i < a; i++)
            listBusca.add(num[i]);
            for (j = 0; j < a; j++)
                if (numeroDigitado[j] == i)
                    System.out.print(num[j] + ",");
        System.out.print("\n");

        System.out.print("Ordem decrescente: ");
        for (i = 0; i <= a; i++)
            for (j = 0; j < a; j++)
                if (numeroDigitado[j] == a - i)
                    System.out.print(num[j] + ",");
        System.out.print("\n");

        System.out.println("Digite algum numero a ser buscado: ");
        numeroAserBuscado = scan1.nextInt();

        for (i = 0; i <= a; i++) {
            for (j = 0; j < a; j++) {
                for (int element : listBusca) {
                    if (element == listBusca.get(i)) {
                        System.out.print("FOi");
                        break;
                    }
                }
            }
            }
        }
    }




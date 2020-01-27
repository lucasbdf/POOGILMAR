package aula01.AS01;
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        int n, temp;
        Scanner s = new Scanner(System.in);
        n = 3;
        int[] a = new int[n];
        System.out.println("Digite todos os numeros de usuarios:");
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ordem Crescente:");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1] + "\n");
    }
}
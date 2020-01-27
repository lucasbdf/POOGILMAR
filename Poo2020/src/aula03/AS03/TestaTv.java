package aula03.AS03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestaTV {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(System.in));
        TV t = new TV();
        System.out.println("\t\tControle");
        System.out.println("1 Ligar");
        System.out.println("2 Aumentar volume");
        System.out.println("3 Diminuir volume");
        System.out.println("4 Aumentar canal");
        System.out.println("5 Diminuir canal");
        System.out.println("6 Desligar");
        System.out.println("Opção:");
        String reply = reader.readLine();
        int op = Integer.parseInt(reply);
        switch (op){
            case 1:
                if (t.isLigado()) {
                    System.out.println("TV já está ligada!");
                }else{
                    t.setLigado(true);
                }
                break;
            case 2:
               
                break;
        }
    }
}
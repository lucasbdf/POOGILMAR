package aula02.AS02.Ex2;
import javax.swing.JOptionPane;
 
public class Exercicio2 {
 

    public static void main(String[] args) {
 
        Double custoFabrica;
        Double custoConsumidor;
        Double porcentagemDistribuidor = 28.0;
        Double PercentualImpostos = 45.0;
        Double Destribuidor;
        Double ValorImpostos;
 
        System.out.println("Informe o custo de f�brica de um carro novo");
        custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de f�brica"));
 
        Destribuidor = (custoFabrica * porcentagemDistribuidor) / 100.000;
        ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
 
        custoConsumidor = (Destribuidor + ValorImpostos);
 
        System.out.println("O custo ao consumidor de um carro novo �: " + custoConsumidor);
    }
}
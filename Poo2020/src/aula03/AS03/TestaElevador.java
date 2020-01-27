package aula03.AS03;
import aula03.LAB.Pessoa;

import java.util.ArrayList;
import java.util.List;

class TestaEvelador {
    public static void main(String[] args) {

        Elevador elevador  = new Elevador();
        int quantidadeAndar  = 10;
        int qualAndar = 5;
        Edificio edificio = new Edificio (quantidadeAndar,elevador);
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        elevador.setAndar(edificio,qualAndar);
        System.out.println(elevador.getAndarAtual());
        System.out.println(elevador.getAndar());
        System.out.println(elevador.getPessoas());
    }

}


package aula03.AS03;

public class Controle {
    Integer volumeMaximo=100, canalMaximo=50;

    TV t = new TV();

    void aumentarVolume(){
        Integer volume = t.getVolume();
        if(volume < volumeMaximo){
            volume++;
            t.setVolume(volume);
        }else{
            System.out.println("Volume ja esta no maximo");
        }
    }

    void diminuirVolume(){

    }

    void subirCanal(){

    }

    void descerCanal(){

    }
}
package aula06.LAB;


public class EnderecoTeste {

    public static void main (String[] args){

        Pais pais = new Pais ("Brasil");
        Estado estado = new Estado("GO", "Goias");
        Municipio municipio=new Municipio(new Long(32323),"Goiania");
        Logradouro log = new Logradouro("RaCunamatata", TipoLogradouro.AVENIDA);
        Bairro bairro = new Bairro("Central", "Setor culuna");
        Endereco end = new Endereco("123", 23132, "4023894", "Residencial");

        System.out.println(end.toString());
    }
}

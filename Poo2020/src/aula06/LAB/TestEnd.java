package aula06.LAB;
public class TestEnd {

	public static void main(String[] args) {
		
	
	Pais pais = new Pais("Brasil");
	Estado goias = new Estado("GO","Goi�s",pais);
	Municipio municipio = new Municipio(new Long(23230),"Goiania",goias);
	Bairro bairro =new Bairro("Central","Setor Central",municipio);
	Logradouro log = new Logradouro("Paranaiba",TipoLogradouro.ALAMEDA);
	Endereco end = new Endereco ("!25","qb. 45 lt. 26A",738474,"Residendial",bairro,log);	
		
	System.out.println(end.toString());
	}
}

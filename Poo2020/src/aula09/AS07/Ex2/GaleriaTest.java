package aula09.as7b.exercicio02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GaleriaTest {

	private static Date formata(String data) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataf = null;
		try {
			dataf = formato.parse(data);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return dataf;
	}

	public static void main(String[] args) {
		
		Galeria g = new Galeria();
		
		Artista a1 = new Artista("Vicent Van Gogh",formata("30/03/1853"),"Pa�ses Baixos");
		Artista a2 = new Artista("Pablo Picasso",formata("25/08/1881"),"Espanha");
		Artista a3 = new Artista("Salvador Dal�",formata("11/05/1904"),"Espanha");
		
		Obra o1 = new Obra("Auto-Retrato",71500000,formata("12/09/1889"),"Vendida","Quadro","�leo,tinta",a1);
		Obra o2 = new Obra("Le R�ve",155000000,formata("12/02/1932"),"Vendida","Quadro","�leo,tinta",a2);
		Obra o3 = new Obra("A Persist�ncia da Mem�ria",0.0,formata("12/06/1931"),"dispon�vel","Quadro","Bronze, Tinta a �leo",a3);
		
		g.setObras(o1);
		g.setObras(o2);
		g.setObras(o3);
		
		g.imprimiObra(g.getObras());
		
	}

}

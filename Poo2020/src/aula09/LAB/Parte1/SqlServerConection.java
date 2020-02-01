package aula09.LAB.Parte1;

public class SqlServerConection implements DBConection {

	@Override
	public void getconnection(String url,String username,String password) {
		System.out.println("Conectado ao SqlServer: " + "\nUrl: " + url + "\nUser: " + username 
				+ "\nPassword: " + password);
	}

}

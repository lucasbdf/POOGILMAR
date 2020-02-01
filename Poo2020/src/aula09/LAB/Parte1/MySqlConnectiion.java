package aula09.LAB.Parte1;

public class MySqlConnectiion implements DBConection {

	@Override
	public void getconnection(String url,String username,String password) {
		System.out.println("Conectado ao MySql: " + "\nUrl: " + url + "\nUser: " + username 
				+ "\nPassword: " + password);
	}

}

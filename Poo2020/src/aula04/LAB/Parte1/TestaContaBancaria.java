package aula04.LAB.Parte1;

import java.util.ArrayList;
import java.util.List;

public class TestaContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria contabancaria = new ContaBancaria();
		contabancaria.setNumero(324566);
		contabancaria.setSaldo(15000.0f);
		contabancaria.setLimite(500.0d);
		contabancaria.setTipo("Corrente");
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Rafael");
		cliente.setEndereco("Rua caiçara");
		cliente.setCpf("199");
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Junio");
		cliente1.setEndereco("Rua caiçara");
		cliente1.setCpf("40023932");
		
		clientes.add(cliente);
		clientes.add(cliente1);
		
		contabancaria.setTitulares(clientes);
		
		System.out.println("Nome dos Titulares da conta: ");
		
		for (Cliente c : contabancaria.getTitulares()){
			System.out.println(c.getNome());
		}
	}

}

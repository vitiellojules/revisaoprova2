package poo;

import java.util.ArrayList;

public class Cliente extends Pessoa{
	
	private Integer nrConta;
	private Double saldo;

	public Cliente() {

	}

	public Integer getNrConta() {
		return nrConta;
	}

	public void setNrConta(Integer nrConta) {
		this.nrConta = nrConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public Double sacar(ArrayList<Cliente> listaClientes, Integer contaSaque, Integer saque) {
		Double saldo = 0.0;
		Double resultado = 0.0;
		
		for (Cliente c1iente : listaClientes) {
			if (contaSaque.equals(c1iente.getNrConta())) {
				saldo = c1iente.getSaldo();
				resultado = saldo - saque;
				c1iente.setSaldo(resultado);
			}
		}

		return resultado;
	}

	public void depositar(ArrayList<Cliente> listaClientes, Integer contaDeposito, Integer deposito) {
		Double saldo = 0.0;
		Double resultado = 0.0;
		
		for (Cliente c1iente : listaClientes) {
			if (contaDeposito.equals(c1iente.getNrConta())) {
				saldo = c1iente.getSaldo();
				resultado = saldo + deposito;
				c1iente.setSaldo(resultado);
				System.out.println("Deposito Realizado com Sucesso. Saldo Atual: " + resultado);

			}else {
				
			}
		}
	}

	public Double mostrarSaldo(String nomeCliente, ArrayList<Cliente> listaClientes) {
		Double saldo = 0.0;

		for (Cliente c1iente : listaClientes) {
			if (nomeCliente.equalsIgnoreCase(c1iente.getNome())) {
				saldo = c1iente.getSaldo();

			} else {
				System.out.println(" ");
			}
		}

		return saldo;
	}

}

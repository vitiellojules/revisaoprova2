package poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	String nome;
	LocalDate dataNasc;
	LocalDate dataContratacao;
	String email;
	String nomeCliente = " ";
	int ano;
	int mes;
	int dia;
	Double result;

	int opcao = 1;

	ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
	ArrayList<Cliente> listaClientes = new ArrayList<>();

	Funcionario funcionario = new Funcionario();

	funcionario.setNome(" nome : ");
	dataNasc = LocalDate.of(2021, 8, 17);
	funcionario.setDataNasc(dataNasc);
	funcionario.setEmail(" vitiello.j1994@aluno.ifsc.edu");
	funcionario.setNrRegistro(5825);
	dataContratacao = LocalDate.of(2016, 10, 20
			);
	funcionario.setDataContratacao(dataContratacao);
	listaFuncionarios.add(funcionario);

	Funcionario funcionario2 = new Funcionario();

	funcionario2.setNome("Jaoa");
	dataNasc = LocalDate.of(2010, 06, 22);
	funcionario2.setDataNasc(dataNasc);
	funcionario2.setEmail("jaoa@gmail.com");
	funcionario2.setNrRegistro(42356);
	dataContratacao = LocalDate.of(2020, 07, 15);
	funcionario2.setDataContratacao(dataContratacao);
	listaFuncionarios.add(funcionario2);

	Cliente cliente = new Cliente();

	cliente.setNome(" cliente1");
	dataNasc = LocalDate.of(1993, 9, 05);
	cliente.setDataNasc(dataNasc);
	cliente.setEmail("cliente1@gmail.com");
	cliente.setNrConta(658475);
	cliente.setSaldo(1000.45);
	listaClientes.add(cliente);

	Cliente cliente2 = new Cliente();

	cliente2.setNome("lucas");
	dataNasc = LocalDate.of(2002, 10, 28);
	cliente2.setDataNasc(dataNasc);
	cliente2.setEmail("lu12@gmail.com");
	cliente2.setNrConta(24156);
	cliente2.setSaldo(214.32);
	listaClientes.add(cliente2);

	Scanner escolher = new Scanner(System.in);

	do {
	
		System.out.println("0 - Sair");
		System.out.println("1 - Sacar");
		System.out.println("2 - Depositar");
		System.out.println("3 - Mostrar Saldo");
		System.out.println("4 - dados Funcionários");
		System.out.println("5 - dados Clientes");
		System.out.println("6 - Contratar Funcionario");
		System.out.println("7 - Pedir Demissão");

		System.out.println(" escolher  opcao desejada: ");
		opcao = escolher.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("digite o numero da conta para saque: ");
			Integer contaSaque = escolher.nextInt();
			System.out.println(" digite o valor para saque: ");
			Integer saque = escolher.nextInt();

			result = cliente.sacar(listaClientes, contaSaque, saque);
			System.out.println("Conta: " + contaSaque);
			System.out.println("Valor saque: " + saque);
			System.out.println("Saldo atual:  " + result);

			break;
		case 2:
			System.out.println("digite  o número da conta para saque: ");
			Integer contaDeposito = escolher.nextInt();
			System.out.println("digite  o valor para saque: ");
			Integer deposito = escolher.nextInt();
			cliente.depositar(listaClientes, contaDeposito, deposito);

			break;
		case 3:

			System.out.println("Informe o nome do Cliente para visualizar o saldo:");
			nomeCliente = escolher.next();

			result = cliente.mostrarSaldo(nomeCliente, listaClientes);

			System.out.println("Cliente: " + nomeCliente);
			System.out.println("Saldo: " + result);
			break;
		case 4:

			

			for (Funcionario func : listaFuncionarios) {
				System.out.println("Nome: " + func.getNome());
				System.out.println("Data de Nascimento: " + func.getDataNasc());
				System.out.println("E-mail: " + func.getEmail());
				System.out.println("Número de Registro: " + func.getNrRegistro());
				System.out.println("Data de Contratação: " + func.getDataContratacao());
				System.out.println(" ");

			}
			break;

		case 5:

			

			for (Cliente c1iente : listaClientes) {
				System.out.println("Nome: " + c1iente.getNome());
				System.out.println("Data de Nascimento: " + c1iente.getDataNasc());
				System.out.println("E-mail: " + c1iente.getEmail());
				System.out.println("Número da Conta: " + c1iente.getNrConta());
				System.out.println("Saldo : " + c1iente.getSaldo());
				System.out.println(" ");

			}
			break;
		case 6:
			System.out.println("digite  o nome do funcionário a ser contratado");
			String nomeFuncionario = escolher.next();

			funcionario.serContratado(nomeFuncionario, listaFuncionarios);
			break;
		case 7:
			System.out.println("Informe o nome do funcionário demitido:");
			nomeFuncionario = escolher.next();

			funcionario.pedirDemissao(nomeFuncionario, listaFuncionarios);
			break;
		}

	} while (opcao != 0);
	System.out.println("  atendimento encerrada ");

	escolher.close();
}

}


		
	





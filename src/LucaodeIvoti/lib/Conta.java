package LucaodeIvoti.lib;

import java.util.ArrayList;
import java.util.Scanner;

public class Conta {
	private String titular;
	private String agencia;
	private String numero;
	private int saldo;
	private double limite;
	private String cpf;
	
	public Conta() {
		
	}

	public String getTitular() {
		return this.titular;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public String getNumero() {
		return this.numero;
	}

	public int getSaldo() {
		return this.saldo;
	}
	
	public double getDebito() {
		return this.saldo;
	}
	
	public boolean getLimite() {
		return this.saldo <= this.limite;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public double getCredito() {
		return this.saldo;
	}

	public String Titular(String nomeCidadao) {
		return this.titular = nomeCidadao;
	}

	public String Agencia(String nomeAgencia) {
		return this.agencia = nomeAgencia;
	}

	public String NumeroConta(String numeroDaConta) {
		return this.numero = numeroDaConta;
	}

	public int Saldo() {
		return this.saldo;
	}
	
	public double Credito(double creditoConta) {
		return this.saldo += creditoConta;
	}

	public double Debito(double debitoConta) {
		return this.saldo -= debitoConta;
	}
	
	public double limiteConta(double limiteDaConta) {
		return this.limite = limiteDaConta;
	}

	public String cpfDoCidadao(String cpfConta) {
		return this.cpf = cpfConta;
	}
	
	public void ImprimeDados() {
		System.out.println("nome: " + titular);
		System.out.println("numero da conta: " + numero);
		System.out.println("agencia: " + agencia);
		System.out.println("saldo: " + saldo);
	}
	
	public ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public void AbreConta() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Abertura de conta");						
		
		System.out.print("Nome: ");
		titular = s.next();
		
		System.out.print("Agência: ");
		numero = s.next();
		
		System.out.print("Número da conta: ");
		agencia = s.next();
		
		this.contas.add(new Conta());		
	}
	
	public void ImprimeContas() {
		for(int i = 0; i < this.contas.size(); i++) {
			this.contas.get(i).ImprimeDados();
		}
	}
	
	public Conta GetUltimaContaAberta() {
		return this.contas.get(this.contas.size()-1);
	}
	
}
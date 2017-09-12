package LucaodeIvoti.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import LucaodeIvoti.lib.Conta;

public class TestaConta {
	private Conta conta;
	
	@Before
	public void before() {
		conta = new Conta();
	}
	

	@Test
	public void testaNomeECPF() {
		conta.Titular("LUCAO");
		conta.cpfDoCidadao("046.054.254-89");
		assertEquals(conta.getTitular(), "LUCAO");
		assertEquals(conta.getCPF(), "046.054.254-89");
	}
	
	@Test
	public void testaAgencia() {
		conta.Agencia("27-99");
		assertEquals(conta.getAgencia(), "27-99");
	}
	
	@Test
	public void testaNumeroConta() {
		conta.NumeroConta("4321-0");
		assertEquals(conta.getNumero(), "4321-0");
	}
	
	@Test
	public void testaSaldo() {
		conta.Saldo();
		assertEquals(conta.getSaldo(), 0, 0);
	}
	
	@Test
	public void testaDebito() {
		conta.Debito(700);
		assertEquals(conta.getDebito(), -700, 0);
	}
	
	@Test
	public void testaCredito() {
		conta.Credito(500);
		assertEquals(conta.getCredito(), 500, 0);
	}
	
	@Test
	public void testaLimiteSaldo() {
		conta.Debito(40);
		conta.limiteConta(-50);
		assertEquals(conta.getLimite(), false);
	}
	
	@Test
	public void excedendoLimiteConta() {
		conta.Saldo();
		conta.Debito(210);
		conta.limiteConta(-20);
		assertEquals(conta.getLimite(), true);
	}
	
}
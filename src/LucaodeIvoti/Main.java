package LucaodeIvoti;

import LucaodeIvoti.lib.Banco;
import LucaodeIvoti.lib.Conta;

	public class Main {  

		public static void main(String[] args) {
		Banco banco = new Banco("Banco");
		
		banco.AbreConta();
		Conta ultimaConta = banco. GetUltimaContaAberta();
		ultimaConta.Credito(1566);
		}

}
package LucaodeIvoti;

import LucaodeIvoti.lib.Conta;

	public class Main {  

		public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.AbreConta();
		conta.Credito(1566);
		
		conta.ImprimeDados();
		}

}
package br.com.fiap.banco;

/**
 * Classe que abstrai uma Conta Bancaria 
 * @author Antonio Novais
 * @version 1.0
 */

public class Test {

	public static void main(String[] args) {
		
    Conta conta1 = new Conta ();
    conta1.depositar(1000);
    conta1.retirar(100);
    
    ContaCorrente conta2 = new ContaCorrente();
    conta2.depositar(1000);
    conta2.retirar(100);
    
    Conta conta3 = new ContaCorrente();
    conta3.depositar(1000);
    conta3.retirar(100);
    
    System.out.println("Conta1:" + conta1.getSaldo());
    System.out.println("Conta2:" + conta2.getSaldo());
    System.out.println("Conta3:" + conta3.getSaldo());
    
		
		

	}
	
}

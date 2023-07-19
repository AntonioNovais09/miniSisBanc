package br.com.fiap.banco;

/**
 * Classe que abstrai uma Conta Bancaria 
 * @author Antonio Novais
 * @version 1.0
 */

public class Test {

	public static void main (String[] args){
		
		Conta cc = new Conta ();
		cc.saldo = 50.0;
		cc.agencia = 123;
		cc.numero = 321;
		
		cc.depositar(1000);
		
		
		System.out.println(cc.verificarSaldo());
		
		Conta poupanca = new Conta(111, 222, 1000);
		poupanca.retirar(50);
		
		System.out.println(poupanca.verificarSaldo());
		
	
		// java doc = @author @deprecated @param @return @see @since @exception @throws @version 
		
	}
}

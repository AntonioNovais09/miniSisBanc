package br.com.fiap.banco;

/**
 * Classe que abstrai uma Conta Bancaria 
 * @author Antonio Novais
 * @version 1.0
 */

public class Test {

	public static void main (String[] args){
		
		Conta cc = new Conta ();
		cc.depositar (50.0);
		cc.setAgencia (123);
		cc.setNumero (321);
		
		cc.depositar(1000);
		
		
		System.out.println( cc.getrSaldo() );
		
		Conta poupanca = new Conta(111, 222, 1000);
		poupanca.retirar(50);
		
		System.out.println( poupanca.getrSaldo() );
		
	
		// java doc = @author @deprecated @param @return @see @since @exception @throws @version 
		
	}
}

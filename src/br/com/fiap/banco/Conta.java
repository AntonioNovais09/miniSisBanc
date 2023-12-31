package br.com.fiap.banco;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta Bancaria
 * @author Antonio Novais
 * @version 1.0
 *
 */
public class Conta implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int agencia;
	private int numero;
	private double saldo;
	
	public Conta() {
		
		
	}

	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		
	}
	
	
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Acrescenta valor ao Saldo da Conta
	 * @param valor que sera Depositado
	 */
	
	public void depositar(double valor) {
		
		this.saldo += valor; /// o += é um operador de atibuiçao que abrevia o repetimento de  this.saldo = this.saldo + ....
	}
	
	/**
	 * Retira um valor da Conta
	 * @param valor que sera retirado
	 * @see depositar
	 */
	
	public void retirar (double valor) {
		
		this.saldo -= valor;
		
		
	}

	/**
	 * Verifica o Saldo da Conta
	 * @return Valor do Saldo da Conta
	 */
	public double getSaldo() {
	
		return this.saldo;
		
	}

	
	
	
}

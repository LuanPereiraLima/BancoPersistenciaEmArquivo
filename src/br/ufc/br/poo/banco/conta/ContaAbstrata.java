package br.ufc.br.poo.banco.conta;

import java.io.Serializable;

public abstract class ContaAbstrata implements Serializable{

	protected String numero;

	protected double saldo;

	public ContaAbstrata(String numero) {
		this.numero = numero;
		this.saldo = 0;
	}

	public void creditar(double valor) {
		this.saldo += valor;
	}

	public abstract void debitar(double valor);

	public String getNumero() {
		return this.numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

}

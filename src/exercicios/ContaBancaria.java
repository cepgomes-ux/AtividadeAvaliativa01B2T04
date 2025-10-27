package exercicios;

public class ContaBancaria {
	
	private String titular;
	private double saldo;
	
	public ContaBancaria (String nomeTitular, double saldoInicial) {
		if (nomeTitular != null && nomeTitular.length() > 0) {
			titular = nomeTitular;
		}
		else {
			titular = "Sem nome";
		}
		
		if (saldoInicial >= 0) {
			saldo = saldoInicial;
		}
		else {
			saldo = 0;
		}
	}
	
	public void depositar (double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
			System.out.println("Deposito de R$" + valor + " realizado!");
		}
		else {
			System.out.println("Valor invalido! O deposito deve ser positivo.");
		}
	}
	
	public void sacar (double valor) {
		if (valor > 0) {
			if (valor <= saldo) {
				saldo = saldo - valor;
				System.out.println("Saque de R$" + valor + " realizado!");
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		else {
			System.out.println("Valor invalido! O saque deve ser positivo.");		
		}
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}

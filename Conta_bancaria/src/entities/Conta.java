package entities;

public class Conta {
	private int numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
	}

	public Conta(int numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	
	public void saque(Double valor) throws Exception{
		if (valor<=saldo && valor<=limiteSaque) {
			saldo = saldo - valor;
			System.out.println("Novo saldo: " + this.getSaldo());
		}else if(valor>saldo){
			
			throw new Exception ("Saldo insuficiente");
		}else if (valor>limiteSaque) {
			throw new Exception("Valor acima do limite de saque.");
		}
	}
	
	public void deposito(Double valor) {
		saldo += valor;
		System.out.println("Novo saldo: " + this.getSaldo());
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	
}

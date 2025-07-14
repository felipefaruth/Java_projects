package entities;

public abstract class Pessoa {
	private String nome;
	private double renda_anual;
	
	public Pessoa(){
	}
	
	public Pessoa(String nome, double renda_anual) {
		this.nome = nome;
		this.renda_anual = renda_anual;
	}

	public abstract double calcImposto();
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getRenda_anual() {
		return renda_anual;
	}


	public void setRenda_anual(double renda_anual) {
		this.renda_anual = renda_anual;
	}
	
	
}

package entities;

public class PessoaFisica extends Pessoa{

	private double gastos_saude;
	
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, double renda_anual, double gastos_saude) {
		super(nome, renda_anual);
		this.gastos_saude = gastos_saude;
	}


	@Override
	public double calcImposto() {
		return 0;
	}

	public double getGastos_saude() {
		return gastos_saude;
	}

	public void setGastos_saude(double gastos_saude) {
		this.gastos_saude = gastos_saude;
	}
	
	

}

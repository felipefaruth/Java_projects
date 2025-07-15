package entities;

public class PessoaFisica extends Pessoa{

	private double gastos_saude;
	
	public PessoaFisica(){
	}
	
	public PessoaFisica(String nome, double renda_anual, double gastos_saude) {
		super(nome, renda_anual);
		this.gastos_saude = gastos_saude;
	}

	@Override
	public double calcImposto() {
		double imp = 0;
		if (getRenda_anual() < 20000.0) {
			imp = getRenda_anual() * 0.15;
		}else if(getRenda_anual() >= 20000.0) {
			imp = getRenda_anual() * 0.25;
		}
		
		if(gastos_saude > 0) {
			imp -= gastos_saude * 0.5;
		}
		
		return imp;
	}

	public double getGastos_saude() {
		return gastos_saude;
	}

	public void setGastos_saude(double gastos_saude) {
		this.gastos_saude = gastos_saude;
	}
}

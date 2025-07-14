package entities;

public class PessoaJuridica extends Pessoa {
	
	private int num_func;

	@Override
	public double calcImposto() {
		double imp = 0;
		if (num_func <= 10) {
			imp = getRenda_anual() * 0.14;
		}else if(num_func > 10 ) {
			imp = getRenda_anual() * 0.16;
		}
		 return imp;
	}

	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, double renda_anual, int num_func) {
		super(nome, renda_anual);
		this.num_func = num_func;
	}

	public int getNum_func() {
		return num_func;
	}

	public void setNum_func(int num_func) {
		this.num_func = num_func;
	}
	
	
	
}

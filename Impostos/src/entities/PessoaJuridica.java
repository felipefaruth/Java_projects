package entities;

public class PessoaJuridica extends Pessoa {
	
	private int num_func;

	@Override
	public double calcImposto() {
		return 0;
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

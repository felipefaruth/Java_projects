package entities;

public class Produto_Importado extends Produto {
	
	private double taxa;
	
	public Produto_Importado() {
	}

	public Produto_Importado(String nome, double price, double taxa) {
		super(nome, price);
		this.taxa = taxa;
	}

	@Override
	public String etiquetaDePreço(){
		return getNome() + " $" + (getPrice() + taxa) + " (Taxa de Import.: $" + taxa + ")";
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}

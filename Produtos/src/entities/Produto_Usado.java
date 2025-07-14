package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto_Usado extends Produto{
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataDeFab;
	
	public Produto_Usado() {
	}

	public Produto_Usado(String nome, double price, Date dataDeFab) {
		super(nome, price);
		this.dataDeFab = dataDeFab;
	}
	
	@Override
	public String etiquetaDePreço(){
		return super.etiquetaDePreço() + "(Data de Fabricação: " + sdf.format(dataDeFab) + ")";
	}

	public Date getDataDeFab() {
		return dataDeFab;
	}

	public void setDataDeFab(Date dataDeFab) {
		this.dataDeFab = dataDeFab;
	}
	
	
	
}

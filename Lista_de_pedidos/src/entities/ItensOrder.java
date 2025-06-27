package entities;

public class ItensOrder {
	private int quant;
	private Double price;
	private Product product;
	
	public Double subTotal() {
		double st;
		st = quant * price;
		return st;
	}
	
	public ItensOrder() {
	}
	
	public ItensOrder(int quant, Double price, Product product) {
		this.quant = quant;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quant;
	}
	public void setQuantity(Integer quantity) {
		this.quant = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName() + ", ");
		sb.append(getPrice() + ", ");
		sb.append("Quant.: " + getQuantity() + ", ");
		sb.append("Subtotal: " + subTotal());
		return sb.toString();
	}
	
}

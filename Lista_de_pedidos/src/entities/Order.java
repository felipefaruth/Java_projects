package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import status.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	private List<ItensOrder> itens = new ArrayList<ItensOrder>();
	
	public Order() {
	}

	
	public Order(Date moment, Client client, OrderStatus status) {
		this.moment = moment;
		this.client = client;
		this.status = status;
	}
	
	public Double total(){
		double total = 0;
		for(ItensOrder i: itens) {
			total += i.subTotal();
		}
		return total;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	public void addItens(ItensOrder item) {
		itens.add(item);
	}

	public void removeItens(ItensOrder item) {
		itens.remove(item);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("RESUMO DO PEDIDO:\n");
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(getMoment()) + "\n");
		sb.append("Status do pedido: ");
		sb.append(getStatus() + "\n");
		sb.append("Cliente: ");
		sb.append(client.toString() + "\n");
		sb.append("Itens do Pedido: \n");
		for(ItensOrder c : itens) {
			sb.append(c.toString() + "\n");
		}
		sb.append("Total: ");
		sb.append(total());
		return sb.toString();
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}
	
}

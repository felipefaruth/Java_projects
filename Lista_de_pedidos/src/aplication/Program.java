package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.ItensOrder;
import entities.Order;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Instant inst = Instant.now();
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
			String name = sc.nextLine();
		System.out.print("Email: ");
			String email = sc.nextLine();
		System.out.print("Aniversário (DD/MM/AAA): ");
			Date niver = sdf.parse(sc.next());
		Client c = new Client(name, email, niver);
		System.out.println();
		System.out.println("Quantos itens terá este pedido: ");
			int n = sc.nextInt();
		Date date = Date.from(inst);
		Order order = new Order(date, c);
		System.out.println();
		for (int i=1; i<=n; i++) {
			System.out.println("Item #" + i + ":");
			System.out.print("Nome do produto: ");
				String nome = sc.next();
			System.out.print("Preço do produto: ");
				double p = sc.nextDouble();
			System.out.print("Quantidade: ");
				int q = sc.nextInt();
			Product product = new Product(nome, p);
			ItensOrder io = new ItensOrder(q, p, product);
			order.addItens(io);
			System.out.println();
			}	
		
			System.out.println(order.toString());
			sc.close();
		}
		
	}



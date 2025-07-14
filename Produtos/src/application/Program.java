package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.Produto_Importado;
import entities.Produto_Usado;

public class Program {
	
public static void main (String args[]) throws ParseException {
	Scanner sc = new Scanner(System.in);
	List<Produto> list = new ArrayList<>();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	System.out.print("Entre com a quantidade de produtos: ");
	int n = sc.nextInt();
	System.out.println();
	for(int i=1; i<=n; i++) {
		System.out.println("Produto #" + i + ":");
		System.out.print("Comun, importado ou usado [c/i/u]: ");
		char prod = sc.next().charAt(0);
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		if(prod == 'i') {
			System.out.print("Taxa: ");
			double taxa = sc.nextDouble();
			list.add(new Produto_Importado(nome, preco, taxa));
		} else if (prod == 'u') {
			System.out.print("Data de Fabricação (DD/MM/AAAA): ");
			Date d = sdf.parse(sc.next());
			list.add(new Produto_Usado(nome, preco, d));
		}else if (prod == 'c') {
			list.add(new Produto(nome, preco));
		}
		System.out.println();
	}
	
	System.out.println("ETIQUETAS DE PREÇO: ");
	for(Produto c : list) {
		System.out.println(c.etiquetaDePreço());
	}
	

	sc.close();
	}

}

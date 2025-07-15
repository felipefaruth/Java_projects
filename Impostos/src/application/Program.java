package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoa>list = new ArrayList<>();
		
		System.out.print("Entre com o numero de pagadores de taxa: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Pagador #" + i + ":");
			System.out.print("Pessoa física ou juridica [f/j]: ");
			char p = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			if(p == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastos = sc.nextDouble();
				list.add(new PessoaFisica(nome, renda, gastos));
			}else if(p == 'j') {
				System.out.print("Número de empregados: ");
				int emp = sc.nextInt();
				list.add(new PessoaJuridica(nome, renda, emp));
			}
			System.out.println();
		}
		
		System.out.println("TAXAS PAGAS: ");
		for(Pessoa c : list) {
			System.out.println(c.getNome() + ": R$" + String.format("%,.2f", c.calcImposto()));
		}
		
		double soma = 0;
		for(Pessoa c : list) {
			soma += c.calcImposto(); 
		}
		
		System.out.printf("TOTAL PAGO: %,.2f", soma);
		
		sc.close();
	}

}

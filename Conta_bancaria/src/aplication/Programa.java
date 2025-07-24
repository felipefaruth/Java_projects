package aplication;

import java.util.Scanner;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com os dados da conta:");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Nome: ");
		sc.nextLine();
		String titu = sc.nextLine();
		System.out.print("Valor incial da conta: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limite = sc.nextDouble();
		Conta c = new Conta(numero, titu, saldo, limite);
		
		try {
			System.out.println();
			System.out.print("Digite o valor do saque: ");	
			c.saque(sc.nextDouble());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}

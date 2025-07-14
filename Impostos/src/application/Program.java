package application;

import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		PessoaJuridica pj = new PessoaJuridica("Bob", 10000, 11);
		
		System.out.println(pj.calcImposto());
	}

}

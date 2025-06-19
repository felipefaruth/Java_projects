package aplication;

import java.util.Scanner;

import entities.Departament;
import entities.Worker;
import entities.WorkerLevel;

public class Program {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Departament dep = new Departament();
		Worker worker = new Worker();
		
		System.out.println("Digite o departamento: ");
			dep.setName(sc.nextLine());
		
		System.out.println("Digite as informações do colaborador: ");
		System.out.println("Nome: ");
			worker.setName(sc.nextLine());
		System.out.println("Level: ");
			worker.setLevel(WorkerLevel.valueOf(sc.nextLine()));
		System.out.println("Salario base: ");
			worker.setBaseSalary(sc.nextDouble());
		
		sc.close();
	}
}

package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

public class Program {
	
	public static void main(String args[]) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Entre com o nome do departemento: ");
		String dep = sc.nextLine();
		System.out.println("Entre com os dados do colaborador:");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Salario base: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(dep));
		System.out.println();
		System.out.println("Quantos contratos para esse colaborador: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n ; i++) {
			System.out.println("Entre com os dados do contrato #" + i + ": ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date cDate = sdf.parse(sc.next());	
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duração: ");
			int duration = sc.nextInt();
			HourContract hc = new HourContract(cDate, valuePerHour, duration);
			worker.addContract(hc);
		}	
		System.out.println();
		System.out.println("Entre com a data (MM/YYYY) para calcular a renda: ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartament().getName());
		System.out.println("Income of " + monthAndYear + ": " + String.format("%.2f", worker.Income(year, month)));
		sc.close();
	}
}

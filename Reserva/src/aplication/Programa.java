package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;
import model.exeptions.DomainException;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Número do quarto: ");
			int num = sc.nextInt();
			System.out.print("Check-in (DD/MM/YYYY): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out (DD/MM/YYYY): ");
			Date checkOut = sdf.parse(sc.next());
			Reserva r = new Reserva(num, checkIn, checkOut);
		
			System.out.println();
			System.out.println("Atualize as datas: ");
			System.out.print("Check-in (DD/MM/YYYY): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out (DD/MM/YYYY): ");
			checkOut = sdf.parse(sc.next());
				
			r.atualizarData(checkOut, checkIn);
			System.out.println("Resumo da reserva: ");
			System.out.println(r.toString());
		}
		catch(ParseException e) {
			System.out.println("Data inválida.");
		}
		catch(DomainException e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpeted error");
		}
	sc.close();
	}
}


package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número do quarto: ");
		int num = sc.nextInt();
		System.out.print("Check-in (dd/mm/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out (dd/mm/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		Reserva r = new Reserva(num, checkIn, checkOut);
		System.out.println();
		System.out.println("Resumo da reserva: ");
		System.out.println(r.toString());
		
	}

}

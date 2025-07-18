package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		// ---------------------  JEITO MUITO RUIM DE TRATAR EXCEÇÕES ----------------------
		System.out.print("Número do quarto: ");
			int num = sc.nextInt();
		System.out.print("Check-in (DD/MM/YYYY): ");
			Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out (DD/MM/YYYY): ");
			Date checkOut = sdf.parse(sc.next());
		Reserva r = new Reserva(num, checkIn, checkOut);
		
		if(checkOut.before(checkIn)) {
			System.out.println("Data inválida");
			System.out.println();
			System.out.println("Atualize as datas: ");
			System.out.print("Check-in (DD/MM/YYYY): ");
				checkIn = sdf.parse(sc.next());
			System.out.print("Check-out (DD/MM/YYYY): ");
				checkOut = sdf.parse(sc.next());
				
			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Datas inválidas: as novas dates devem ser posteriores a data atual.");
			}else if(checkOut.before(now)) {
				System.out.println("Data de Check-out inválida: a nova data de check-out deve ser posterior a data de check-in.");
			}else {
				r.atualizarData(checkOut, checkIn);
				System.out.println("Resumo da reserva: ");
				System.out.println(r.toString());
			}
		}
		// -------------------------------------------------------------------------------------------------------------------
		sc.close();
	}
}

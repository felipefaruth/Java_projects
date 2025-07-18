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
				
			String erro = r.atualizarData(checkOut, checkIn);
				if (erro != null) {
					System.out.println(erro);
				}else {
					System.out.println("Resumo da reserva: ");
					System.out.println(r.toString());
				}
			}
		sc.close();
		}
	}


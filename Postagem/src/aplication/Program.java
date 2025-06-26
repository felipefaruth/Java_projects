package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Coments;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Coments c1 = new Coments("Boa viagem!");
		Coments c2 = new Coments("Esse lugar é lindo!");
	   
		
		Post p1 = new Post(sdf.parse("25/06/2025 10:03:00"), "Viagem, uhul!", 12, "foto de viagem");
		
		p1.addComent(c1);
		p1.addComent(c2);
		
		System.out.println(p1);
	}

}

package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer numQrt;
	private Date checkIn;
	private Date checkOut;
	
	public Reserva() {
	}

	
	public Reserva(Integer numQrt, Date checkIn, Date checkOut) {
		this.numQrt = numQrt;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}


	public long duracao() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void atualizarData(Date checkOut, Date checkIn) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}


	public Integer getNumQrt() {
		return numQrt;
	}


	public void setNumQrt(Integer numQrt) {
		this.numQrt = numQrt;
	}


	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}


	@Override
	public String toString() {
		return "Quarto: " + numQrt + "\n"
				+ "Check In: " + sdf.format(checkIn) + "\n"
				+"Check Out: " + sdf.format(checkOut) + "\n" 
				+ "Estadia: " + duracao() + " dias";
	}

	 
}

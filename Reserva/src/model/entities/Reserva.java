package model.entities;

import java.util.Date;

public class Reserva {
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


	public int duracao() {
		return 0;
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

}

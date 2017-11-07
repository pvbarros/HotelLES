package model;

import java.sql.Date;

import enumerator.TipoQuarto;

public class Reservar {
	
	private Date checkIn;
	private Date checkOut;
	private TipoQuarto tipoQuarto;
	private int qtdQuarto;
	private int qtdHospedes;
	private String destino;
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	
	public TipoQuarto getTipoQuarto() {
		return tipoQuarto;
	}
	
	public void setTipoQuarto(TipoQuarto tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	
	public int getQtdQuarto() {
		return qtdQuarto;
	}
	
	public void setQtdQuarto(int qtdQuarto) {
		this.qtdQuarto = qtdQuarto;
	}
	
	public int getQtdHospedes() {
		return qtdHospedes;
	}
	
	public void setQtdHospedes(int qtdHospedes) {
		this.qtdHospedes = qtdHospedes;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}

	
	
	

}

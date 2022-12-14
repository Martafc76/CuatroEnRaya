package org.iesalandalus.programacion.cuatroenraya.modelo;

public class Casilla {
	public Ficha ficha;
	
	public Casilla() {
		setFicha(null);
	}

	public boolean estaOcupada() {

		// Si la casilla contiene una ficha, devuelve true
		if (this.ficha != null) {
			return true;
		}
		// En caso contrario, devuelve false
		return false;
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		if (ficha == null) {
			throw new NullPointerException("La ficha no puede ser nula");
		}
		this.ficha = ficha;
	}

	@Override
	public String toString() {
		return String.format("%s", ficha == null ? " " : ficha.name().charAt(0));
	}

	

}

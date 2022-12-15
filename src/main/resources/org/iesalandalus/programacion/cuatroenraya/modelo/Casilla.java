package org.iesalandalus.programacion.cuatroenraya.modelo;

import javax.naming.OperationNotSupportedException;

public class Casilla {
	public Ficha ficha;
	
	public Casilla() {
		ficha = null;
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

	public void setFicha(Ficha ficha) throws OperationNotSupportedException {
		if(estaOcupada()) {
			throw new OperationNotSupportedException("ERROR: Ya contengo una ficha.");
		}
		if(ficha == null) {
			throw new NullPointerException("ERROR: No se puede poner una ficha nula.");
			}
		this.ficha = ficha;
	}

	@Override
	public String toString() {
		return String.format("%s", ficha == null ? " " : ficha.name().charAt(0));
	}

	

}

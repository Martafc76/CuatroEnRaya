package uml;

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
		if(ficha == Ficha.AZUL) {
			return String.format("%s", "A");
		}
		else if(ficha == Ficha.VERDE) {
			return String.format("%s", "V");
		} else {
			return null;
		}
	}

	

}

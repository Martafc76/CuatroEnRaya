import org.iesalandalus.programacion.cuatroenraya.modelo.Casilla;
import org.iesalandalus.programacion.cuatroenraya.modelo.Ficha;

public class Tablero {
	public static final int FILAS = 6;
	public static final int COLUMNAS = 7;
	public static final int FICHAS_IGUALES_CONSECUTIVAS_NECESARIAS = 4;
	private Casilla[][] casillas;

	public Tablero() {
		casillas = new Casilla[FILAS][COLUMNAS];

	}

	private boolean columnaVacia(int columna) {
		boolean estaVacia = true;
		for (int i = 0; i < casillas.length; i++) {
			if ( != null) { //con if compruebo
				estaVacia = false;
			}
		}
		return estaVacia;
	}

	public boolean estaVacio() {
		boolean estaVacio = true;
		for (int i = 0; i < COLUMNAS; i++) {
			if (!columnaVacia(i)) {// La ! niega las cosas, en este ejemplo es "Si la columna NO está vacía"
				estaVacio = false;
			}
		}
		return estaVacio;
	}

	private boolean columnaLlena(int columna) {
		boolean estaLlena = false;
		int numFichas = 0;
		for (int i = 0; i < casillas.length; i++) {
			if (casillas[i][columna] != null) {
				numFichas++;
			}
		}
		if (numFichas == FILAS) {
			estaLlena = true;
		}
		return estaLlena;
	}
	
	public boolean estaLleno() {
		boolean estaLleno = true;
		for(int i = 0; i < COLUMNAS; i++ ) {
			if(!columnaLlena(i)) {
				estaLleno = false;
			}
		}
		return estaLleno;
	}
	
	private void comprobarFicha(Ficha ficha) {
		if(ficha.equals(null)) {
			throw new NullPointerException("La ficha no puede ser nula");
		}
	}
	
	private void comprobarColumna(int columna) {
		if(columna < 0 || columna > COLUMNAS) {
			throw new IllegalArgumentException("La columna no es válida");
		}
	}
	
	private int getPrimeraFilaVacia(int columna) {
		for (int i = FILAS - 1; i >= 0; i--) {
			if(casillas[i][columna] == null) {
				return i;
			}
		}
		return FILAS -1;
	}
	
	private boolean objetivoAlcanzado(int numFichasConsecutivas) {
		if(numFichasConsecutivas >= FICHAS_IGUALES_CONSECUTIVAS_NECESARIAS) {
			return true;
		}
		return false;
	}
	
	private boolean comprobarHorizontal(Ficha ficha, int fila) {
		int contFicha = 0;
		for (int i = 0; i < casillas[fila].length; i++) {
			if(casillas[fila][i].getFicha() == ficha) {
				contFicha++;
			} else {
				contFicha = 0;
			}
		}
		if(contFicha == 4) {
			return true;
		} else {
			return false;
		}
		
	}
	
	private boolean comprobarVertical(int columna, Ficha ficha) {
		int contFicha = 0;
		for (int i = 0; i < casillas[columna].length; i++) {
			if(casillas[i][columna].getFicha() == ficha) {
				contFicha++;
			} else {
				contFicha = 0;
			}
		}
		if(contFicha == 4) {
			return true;
		} else {
			return false;
		}
	}
	
	private int menor(int fila, int columna) {
		if(fila < columna) {
			return fila;
		} else {
			return columna;
		}
	}
	
	
	
	
	
	
	
	

}

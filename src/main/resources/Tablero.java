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
			if (casillas[i][columna] != null) {
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

}

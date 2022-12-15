package org.iesalandalus.programacion.cuatroenraya.modelo;

import org.apache.commons.math3.exception.NullArgumentException;

public class Jugador {
	private String nombre;
	private Ficha colorFicha;
	
	public Jugador(String nombre, Ficha colorFicha) {
		setNombre(nombre);
		setFicha(colorFicha);
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		if(nombre == null) {
			throw new NullPointerException("El nombre no puede ser nulo");
		}
		this.nombre = nombre;
	}
	public Ficha getFicha() {
		return colorFicha;
	}
	private void setFicha(Ficha colorFicha) {
		this.colorFicha = ficha;
	}
	
	

}

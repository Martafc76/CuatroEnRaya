package org.iesalandalus.programacion.cuatroenraya.modelo;

public enum Ficha {
	AZUL("azul"),
	VERDE("verde");
	
	private String cadenaAMostrar;

	private Ficha(String cadenaMostrar) {
		this.cadenaAMostrar = cadenaMostrar;
	}
	//sobreescribe métodos
	@Override
	public String toString(){
		return cadenaAMostrar;
	}
}





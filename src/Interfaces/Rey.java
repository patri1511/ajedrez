package Interfaces;

public class Rey implements Figura{
	
	String color;

	public Rey(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Rey [color=" + color + "]";
	}

	@Override
	public String Nombre() {
		// TODO Apéndice de método generado automáticamente
		return "Rey [color=" + color + "]";
	}

	@Override
	public String Mover() {
		// TODO Apéndice de método generado automáticamente
		return "El rey se puede mover en cualquier dirección (vertical, horizontal y diagonales) avanzando o retrocediendo una sola casilla (excepto en el enroque, en el cual se mueve 2 casillas).";
	}

	@Override
	public String Capturar() {
		// TODO Apéndice de método generado automáticamente
		return "Se puede capturar en cualquier dirección (vertical, horizontal y diagonales).";
	}
}
